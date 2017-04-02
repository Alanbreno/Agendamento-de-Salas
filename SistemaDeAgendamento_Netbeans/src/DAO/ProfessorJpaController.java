/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DAO.exceptions.NonexistentEntityException;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import Entidades.Horario;
import java.util.ArrayList;
import java.util.Collection;
import Entidades.Disciplina;
import Entidades.Professor;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Alan Breno
 */
public class ProfessorJpaController implements Serializable {

    public ProfessorJpaController() {
        this.emf = Persistence.createEntityManagerFactory("SistemaDeAgendamentoPU");
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Professor professor) {
        if (professor.getHorarioCollection() == null) {
            professor.setHorarioCollection(new ArrayList<Horario>());
        }
        if (professor.getDisciplinaCollection() == null) {
            professor.setDisciplinaCollection(new ArrayList<Disciplina>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Collection<Horario> attachedHorarioCollection = new ArrayList<Horario>();
            for (Horario horarioCollectionHorarioToAttach : professor.getHorarioCollection()) {
                horarioCollectionHorarioToAttach = em.getReference(horarioCollectionHorarioToAttach.getClass(), horarioCollectionHorarioToAttach.getHorarioId());
                attachedHorarioCollection.add(horarioCollectionHorarioToAttach);
            }
            professor.setHorarioCollection(attachedHorarioCollection);
            Collection<Disciplina> attachedDisciplinaCollection = new ArrayList<Disciplina>();
            for (Disciplina disciplinaCollectionDisciplinaToAttach : professor.getDisciplinaCollection()) {
                disciplinaCollectionDisciplinaToAttach = em.getReference(disciplinaCollectionDisciplinaToAttach.getClass(), disciplinaCollectionDisciplinaToAttach.getDisciplinaId());
                attachedDisciplinaCollection.add(disciplinaCollectionDisciplinaToAttach);
            }
            professor.setDisciplinaCollection(attachedDisciplinaCollection);
            em.persist(professor);
            for (Horario horarioCollectionHorario : professor.getHorarioCollection()) {
                horarioCollectionHorario.getProfessorCollection().add(professor);
                horarioCollectionHorario = em.merge(horarioCollectionHorario);
            }
            for (Disciplina disciplinaCollectionDisciplina : professor.getDisciplinaCollection()) {
                disciplinaCollectionDisciplina.getProfessorCollection().add(professor);
                disciplinaCollectionDisciplina = em.merge(disciplinaCollectionDisciplina);
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Professor professor) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Professor persistentProfessor = em.find(Professor.class, professor.getProfessorId());
            Collection<Horario> horarioCollectionOld = persistentProfessor.getHorarioCollection();
            Collection<Horario> horarioCollectionNew = professor.getHorarioCollection();
            Collection<Disciplina> disciplinaCollectionOld = persistentProfessor.getDisciplinaCollection();
            Collection<Disciplina> disciplinaCollectionNew = professor.getDisciplinaCollection();
            Collection<Horario> attachedHorarioCollectionNew = new ArrayList<Horario>();
            for (Horario horarioCollectionNewHorarioToAttach : horarioCollectionNew) {
                horarioCollectionNewHorarioToAttach = em.getReference(horarioCollectionNewHorarioToAttach.getClass(), horarioCollectionNewHorarioToAttach.getHorarioId());
                attachedHorarioCollectionNew.add(horarioCollectionNewHorarioToAttach);
            }
            horarioCollectionNew = attachedHorarioCollectionNew;
            professor.setHorarioCollection(horarioCollectionNew);
            Collection<Disciplina> attachedDisciplinaCollectionNew = new ArrayList<Disciplina>();
            for (Disciplina disciplinaCollectionNewDisciplinaToAttach : disciplinaCollectionNew) {
                disciplinaCollectionNewDisciplinaToAttach = em.getReference(disciplinaCollectionNewDisciplinaToAttach.getClass(), disciplinaCollectionNewDisciplinaToAttach.getDisciplinaId());
                attachedDisciplinaCollectionNew.add(disciplinaCollectionNewDisciplinaToAttach);
            }
            disciplinaCollectionNew = attachedDisciplinaCollectionNew;
            professor.setDisciplinaCollection(disciplinaCollectionNew);
            professor = em.merge(professor);
            for (Horario horarioCollectionOldHorario : horarioCollectionOld) {
                if (!horarioCollectionNew.contains(horarioCollectionOldHorario)) {
                    horarioCollectionOldHorario.getProfessorCollection().remove(professor);
                    horarioCollectionOldHorario = em.merge(horarioCollectionOldHorario);
                }
            }
            for (Horario horarioCollectionNewHorario : horarioCollectionNew) {
                if (!horarioCollectionOld.contains(horarioCollectionNewHorario)) {
                    horarioCollectionNewHorario.getProfessorCollection().add(professor);
                    horarioCollectionNewHorario = em.merge(horarioCollectionNewHorario);
                }
            }
            for (Disciplina disciplinaCollectionOldDisciplina : disciplinaCollectionOld) {
                if (!disciplinaCollectionNew.contains(disciplinaCollectionOldDisciplina)) {
                    disciplinaCollectionOldDisciplina.getProfessorCollection().remove(professor);
                    disciplinaCollectionOldDisciplina = em.merge(disciplinaCollectionOldDisciplina);
                }
            }
            for (Disciplina disciplinaCollectionNewDisciplina : disciplinaCollectionNew) {
                if (!disciplinaCollectionOld.contains(disciplinaCollectionNewDisciplina)) {
                    disciplinaCollectionNewDisciplina.getProfessorCollection().add(professor);
                    disciplinaCollectionNewDisciplina = em.merge(disciplinaCollectionNewDisciplina);
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = professor.getProfessorId();
                if (findProfessor(id) == null) {
                    throw new NonexistentEntityException("The professor with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Integer id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Professor professor;
            try {
                professor = em.getReference(Professor.class, id);
                professor.getProfessorId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The professor with id " + id + " no longer exists.", enfe);
            }
            Collection<Horario> horarioCollection = professor.getHorarioCollection();
            for (Horario horarioCollectionHorario : horarioCollection) {
                horarioCollectionHorario.getProfessorCollection().remove(professor);
                horarioCollectionHorario = em.merge(horarioCollectionHorario);
            }
            Collection<Disciplina> disciplinaCollection = professor.getDisciplinaCollection();
            for (Disciplina disciplinaCollectionDisciplina : disciplinaCollection) {
                disciplinaCollectionDisciplina.getProfessorCollection().remove(professor);
                disciplinaCollectionDisciplina = em.merge(disciplinaCollectionDisciplina);
            }
            em.remove(professor);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Professor> findProfessorEntities() {
        return findProfessorEntities(true, -1, -1);
    }

    public List<Professor> findProfessorEntities(int maxResults, int firstResult) {
        return findProfessorEntities(false, maxResults, firstResult);
    }

    private List<Professor> findProfessorEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Professor.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Professor findProfessor(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Professor.class, id);
        } finally {
            em.close();
        }
    }

    public int getProfessorCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Professor> rt = cq.from(Professor.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }

    public List<Professor> findProfessorOrdered() {
        EntityManager em = getEntityManager();
        try {
            String sql = "SELECT p FROM Professor p ORDER BY p.professorNome";
            Query query = em.createQuery(sql);
            return query.getResultList();
        } finally {
            em.close();
        }
    }
    
}
