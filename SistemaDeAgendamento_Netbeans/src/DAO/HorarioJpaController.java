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
import Entidades.Sala;
import java.util.ArrayList;
import java.util.Collection;
import Entidades.Disciplina;
import Entidades.Horario;
import Entidades.Professor;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Alan Breno
 */
public class HorarioJpaController implements Serializable {

    public HorarioJpaController() {
        this.emf = Persistence.createEntityManagerFactory("SistemaDeAgendamentoPU");
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Horario horario) {
        if (horario.getSalaCollection() == null) {
            horario.setSalaCollection(new ArrayList<Sala>());
        }
        if (horario.getDisciplinaCollection() == null) {
            horario.setDisciplinaCollection(new ArrayList<Disciplina>());
        }
        if (horario.getProfessorCollection() == null) {
            horario.setProfessorCollection(new ArrayList<Professor>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Collection<Sala> attachedSalaCollection = new ArrayList<Sala>();
            for (Sala salaCollectionSalaToAttach : horario.getSalaCollection()) {
                salaCollectionSalaToAttach = em.getReference(salaCollectionSalaToAttach.getClass(), salaCollectionSalaToAttach.getSalaId());
                attachedSalaCollection.add(salaCollectionSalaToAttach);
            }
            horario.setSalaCollection(attachedSalaCollection);
            Collection<Disciplina> attachedDisciplinaCollection = new ArrayList<Disciplina>();
            for (Disciplina disciplinaCollectionDisciplinaToAttach : horario.getDisciplinaCollection()) {
                disciplinaCollectionDisciplinaToAttach = em.getReference(disciplinaCollectionDisciplinaToAttach.getClass(), disciplinaCollectionDisciplinaToAttach.getDisciplinaId());
                attachedDisciplinaCollection.add(disciplinaCollectionDisciplinaToAttach);
            }
            horario.setDisciplinaCollection(attachedDisciplinaCollection);
            Collection<Professor> attachedProfessorCollection = new ArrayList<Professor>();
            for (Professor professorCollectionProfessorToAttach : horario.getProfessorCollection()) {
                professorCollectionProfessorToAttach = em.getReference(professorCollectionProfessorToAttach.getClass(), professorCollectionProfessorToAttach.getProfessorId());
                attachedProfessorCollection.add(professorCollectionProfessorToAttach);
            }
            horario.setProfessorCollection(attachedProfessorCollection);
            em.persist(horario);
            for (Sala salaCollectionSala : horario.getSalaCollection()) {
                salaCollectionSala.getHorarioCollection().add(horario);
                salaCollectionSala = em.merge(salaCollectionSala);
            }
            for (Disciplina disciplinaCollectionDisciplina : horario.getDisciplinaCollection()) {
                disciplinaCollectionDisciplina.getHorarioCollection().add(horario);
                disciplinaCollectionDisciplina = em.merge(disciplinaCollectionDisciplina);
            }
            for (Professor professorCollectionProfessor : horario.getProfessorCollection()) {
                professorCollectionProfessor.getHorarioCollection().add(horario);
                professorCollectionProfessor = em.merge(professorCollectionProfessor);
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Horario horario) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Horario persistentHorario = em.find(Horario.class, horario.getHorarioId());
            Collection<Sala> salaCollectionOld = persistentHorario.getSalaCollection();
            Collection<Sala> salaCollectionNew = horario.getSalaCollection();
            Collection<Disciplina> disciplinaCollectionOld = persistentHorario.getDisciplinaCollection();
            Collection<Disciplina> disciplinaCollectionNew = horario.getDisciplinaCollection();
            Collection<Professor> professorCollectionOld = persistentHorario.getProfessorCollection();
            Collection<Professor> professorCollectionNew = horario.getProfessorCollection();
            Collection<Sala> attachedSalaCollectionNew = new ArrayList<Sala>();
            for (Sala salaCollectionNewSalaToAttach : salaCollectionNew) {
                salaCollectionNewSalaToAttach = em.getReference(salaCollectionNewSalaToAttach.getClass(), salaCollectionNewSalaToAttach.getSalaId());
                attachedSalaCollectionNew.add(salaCollectionNewSalaToAttach);
            }
            salaCollectionNew = attachedSalaCollectionNew;
            horario.setSalaCollection(salaCollectionNew);
            Collection<Disciplina> attachedDisciplinaCollectionNew = new ArrayList<Disciplina>();
            for (Disciplina disciplinaCollectionNewDisciplinaToAttach : disciplinaCollectionNew) {
                disciplinaCollectionNewDisciplinaToAttach = em.getReference(disciplinaCollectionNewDisciplinaToAttach.getClass(), disciplinaCollectionNewDisciplinaToAttach.getDisciplinaId());
                attachedDisciplinaCollectionNew.add(disciplinaCollectionNewDisciplinaToAttach);
            }
            disciplinaCollectionNew = attachedDisciplinaCollectionNew;
            horario.setDisciplinaCollection(disciplinaCollectionNew);
            Collection<Professor> attachedProfessorCollectionNew = new ArrayList<Professor>();
            for (Professor professorCollectionNewProfessorToAttach : professorCollectionNew) {
                professorCollectionNewProfessorToAttach = em.getReference(professorCollectionNewProfessorToAttach.getClass(), professorCollectionNewProfessorToAttach.getProfessorId());
                attachedProfessorCollectionNew.add(professorCollectionNewProfessorToAttach);
            }
            professorCollectionNew = attachedProfessorCollectionNew;
            horario.setProfessorCollection(professorCollectionNew);
            horario = em.merge(horario);
            for (Sala salaCollectionOldSala : salaCollectionOld) {
                if (!salaCollectionNew.contains(salaCollectionOldSala)) {
                    salaCollectionOldSala.getHorarioCollection().remove(horario);
                    salaCollectionOldSala = em.merge(salaCollectionOldSala);
                }
            }
            for (Sala salaCollectionNewSala : salaCollectionNew) {
                if (!salaCollectionOld.contains(salaCollectionNewSala)) {
                    salaCollectionNewSala.getHorarioCollection().add(horario);
                    salaCollectionNewSala = em.merge(salaCollectionNewSala);
                }
            }
            for (Disciplina disciplinaCollectionOldDisciplina : disciplinaCollectionOld) {
                if (!disciplinaCollectionNew.contains(disciplinaCollectionOldDisciplina)) {
                    disciplinaCollectionOldDisciplina.getHorarioCollection().remove(horario);
                    disciplinaCollectionOldDisciplina = em.merge(disciplinaCollectionOldDisciplina);
                }
            }
            for (Disciplina disciplinaCollectionNewDisciplina : disciplinaCollectionNew) {
                if (!disciplinaCollectionOld.contains(disciplinaCollectionNewDisciplina)) {
                    disciplinaCollectionNewDisciplina.getHorarioCollection().add(horario);
                    disciplinaCollectionNewDisciplina = em.merge(disciplinaCollectionNewDisciplina);
                }
            }
            for (Professor professorCollectionOldProfessor : professorCollectionOld) {
                if (!professorCollectionNew.contains(professorCollectionOldProfessor)) {
                    professorCollectionOldProfessor.getHorarioCollection().remove(horario);
                    professorCollectionOldProfessor = em.merge(professorCollectionOldProfessor);
                }
            }
            for (Professor professorCollectionNewProfessor : professorCollectionNew) {
                if (!professorCollectionOld.contains(professorCollectionNewProfessor)) {
                    professorCollectionNewProfessor.getHorarioCollection().add(horario);
                    professorCollectionNewProfessor = em.merge(professorCollectionNewProfessor);
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = horario.getHorarioId();
                if (findHorario(id) == null) {
                    throw new NonexistentEntityException("The horario with id " + id + " no longer exists.");
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
            Horario horario;
            try {
                horario = em.getReference(Horario.class, id);
                horario.getHorarioId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The horario with id " + id + " no longer exists.", enfe);
            }
            Collection<Sala> salaCollection = horario.getSalaCollection();
            for (Sala salaCollectionSala : salaCollection) {
                salaCollectionSala.getHorarioCollection().remove(horario);
                salaCollectionSala = em.merge(salaCollectionSala);
            }
            Collection<Disciplina> disciplinaCollection = horario.getDisciplinaCollection();
            for (Disciplina disciplinaCollectionDisciplina : disciplinaCollection) {
                disciplinaCollectionDisciplina.getHorarioCollection().remove(horario);
                disciplinaCollectionDisciplina = em.merge(disciplinaCollectionDisciplina);
            }
            Collection<Professor> professorCollection = horario.getProfessorCollection();
            for (Professor professorCollectionProfessor : professorCollection) {
                professorCollectionProfessor.getHorarioCollection().remove(horario);
                professorCollectionProfessor = em.merge(professorCollectionProfessor);
            }
            em.remove(horario);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Horario> findHorarioEntities() {
        return findHorarioEntities(true, -1, -1);
    }

    public List<Horario> findHorarioEntities(int maxResults, int firstResult) {
        return findHorarioEntities(false, maxResults, firstResult);
    }

    private List<Horario> findHorarioEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Horario.class));
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

    public Horario findHorario(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Horario.class, id);
        } finally {
            em.close();
        }
    }

    public int getHorarioCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Horario> rt = cq.from(Horario.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
