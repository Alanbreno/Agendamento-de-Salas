/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DAO.exceptions.NonexistentEntityException;
import Entidades.Disciplina;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import Entidades.Turma;
import java.util.ArrayList;
import java.util.Collection;
import Entidades.Horario;
import Entidades.Professor;
import Entidades.Sala;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author Alan Breno
 */
public class DisciplinaJpaController implements Serializable {
    
    private EntityManagerFactory emf = null;
    
    public DisciplinaJpaController() {
        this.emf = Persistence.createEntityManagerFactory("SistemaDeAgendamentoPU");
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Disciplina disciplina) {
        if (disciplina.getTurmaCollection() == null) {
            disciplina.setTurmaCollection(new ArrayList<Turma>());
        }
        if (disciplina.getHorarioCollection() == null) {
            disciplina.setHorarioCollection(new ArrayList<Horario>());
        }
        if (disciplina.getProfessorCollection() == null) {
            disciplina.setProfessorCollection(new ArrayList<Professor>());
        }
        if (disciplina.getSalaCollection() == null) {
            disciplina.setSalaCollection(new ArrayList<Sala>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Collection<Turma> attachedTurmaCollection = new ArrayList<Turma>();
            for (Turma turmaCollectionTurmaToAttach : disciplina.getTurmaCollection()) {
                turmaCollectionTurmaToAttach = em.getReference(turmaCollectionTurmaToAttach.getClass(), turmaCollectionTurmaToAttach.getTurmaId());
                attachedTurmaCollection.add(turmaCollectionTurmaToAttach);
            }
            disciplina.setTurmaCollection(attachedTurmaCollection);
            Collection<Horario> attachedHorarioCollection = new ArrayList<Horario>();
            for (Horario horarioCollectionHorarioToAttach : disciplina.getHorarioCollection()) {
                horarioCollectionHorarioToAttach = em.getReference(horarioCollectionHorarioToAttach.getClass(), horarioCollectionHorarioToAttach.getHorarioId());
                attachedHorarioCollection.add(horarioCollectionHorarioToAttach);
            }
            disciplina.setHorarioCollection(attachedHorarioCollection);
            Collection<Professor> attachedProfessorCollection = new ArrayList<Professor>();
            for (Professor professorCollectionProfessorToAttach : disciplina.getProfessorCollection()) {
                professorCollectionProfessorToAttach = em.getReference(professorCollectionProfessorToAttach.getClass(), professorCollectionProfessorToAttach.getProfessorId());
                attachedProfessorCollection.add(professorCollectionProfessorToAttach);
            }
            disciplina.setProfessorCollection(attachedProfessorCollection);
            Collection<Sala> attachedSalaCollection = new ArrayList<Sala>();
            for (Sala salaCollectionSalaToAttach : disciplina.getSalaCollection()) {
                salaCollectionSalaToAttach = em.getReference(salaCollectionSalaToAttach.getClass(), salaCollectionSalaToAttach.getSalaId());
                attachedSalaCollection.add(salaCollectionSalaToAttach);
            }
            disciplina.setSalaCollection(attachedSalaCollection);
            em.persist(disciplina);
            for (Turma turmaCollectionTurma : disciplina.getTurmaCollection()) {
                turmaCollectionTurma.getDisciplinaCollection().add(disciplina);
                turmaCollectionTurma = em.merge(turmaCollectionTurma);
            }
            for (Horario horarioCollectionHorario : disciplina.getHorarioCollection()) {
                horarioCollectionHorario.getDisciplinaCollection().add(disciplina);
                horarioCollectionHorario = em.merge(horarioCollectionHorario);
            }
            for (Professor professorCollectionProfessor : disciplina.getProfessorCollection()) {
                professorCollectionProfessor.getDisciplinaCollection().add(disciplina);
                professorCollectionProfessor = em.merge(professorCollectionProfessor);
            }
            for (Sala salaCollectionSala : disciplina.getSalaCollection()) {
                salaCollectionSala.getDisciplinaCollection().add(disciplina);
                salaCollectionSala = em.merge(salaCollectionSala);
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Disciplina disciplina) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Disciplina persistentDisciplina = em.find(Disciplina.class, disciplina.getDisciplinaId());
            Collection<Turma> turmaCollectionOld = persistentDisciplina.getTurmaCollection();
            Collection<Turma> turmaCollectionNew = disciplina.getTurmaCollection();
            Collection<Horario> horarioCollectionOld = persistentDisciplina.getHorarioCollection();
            Collection<Horario> horarioCollectionNew = disciplina.getHorarioCollection();
            Collection<Professor> professorCollectionOld = persistentDisciplina.getProfessorCollection();
            Collection<Professor> professorCollectionNew = disciplina.getProfessorCollection();
            Collection<Sala> salaCollectionOld = persistentDisciplina.getSalaCollection();
            Collection<Sala> salaCollectionNew = disciplina.getSalaCollection();
            Collection<Turma> attachedTurmaCollectionNew = new ArrayList<Turma>();
            for (Turma turmaCollectionNewTurmaToAttach : turmaCollectionNew) {
                turmaCollectionNewTurmaToAttach = em.getReference(turmaCollectionNewTurmaToAttach.getClass(), turmaCollectionNewTurmaToAttach.getTurmaId());
                attachedTurmaCollectionNew.add(turmaCollectionNewTurmaToAttach);
            }
            turmaCollectionNew = attachedTurmaCollectionNew;
            disciplina.setTurmaCollection(turmaCollectionNew);
            Collection<Horario> attachedHorarioCollectionNew = new ArrayList<Horario>();
            for (Horario horarioCollectionNewHorarioToAttach : horarioCollectionNew) {
                horarioCollectionNewHorarioToAttach = em.getReference(horarioCollectionNewHorarioToAttach.getClass(), horarioCollectionNewHorarioToAttach.getHorarioId());
                attachedHorarioCollectionNew.add(horarioCollectionNewHorarioToAttach);
            }
            horarioCollectionNew = attachedHorarioCollectionNew;
            disciplina.setHorarioCollection(horarioCollectionNew);
            Collection<Professor> attachedProfessorCollectionNew = new ArrayList<Professor>();
            for (Professor professorCollectionNewProfessorToAttach : professorCollectionNew) {
                professorCollectionNewProfessorToAttach = em.getReference(professorCollectionNewProfessorToAttach.getClass(), professorCollectionNewProfessorToAttach.getProfessorId());
                attachedProfessorCollectionNew.add(professorCollectionNewProfessorToAttach);
            }
            professorCollectionNew = attachedProfessorCollectionNew;
            disciplina.setProfessorCollection(professorCollectionNew);
            Collection<Sala> attachedSalaCollectionNew = new ArrayList<Sala>();
            for (Sala salaCollectionNewSalaToAttach : salaCollectionNew) {
                salaCollectionNewSalaToAttach = em.getReference(salaCollectionNewSalaToAttach.getClass(), salaCollectionNewSalaToAttach.getSalaId());
                attachedSalaCollectionNew.add(salaCollectionNewSalaToAttach);
            }
            salaCollectionNew = attachedSalaCollectionNew;
            disciplina.setSalaCollection(salaCollectionNew);
            disciplina = em.merge(disciplina);
            for (Turma turmaCollectionOldTurma : turmaCollectionOld) {
                if (!turmaCollectionNew.contains(turmaCollectionOldTurma)) {
                    turmaCollectionOldTurma.getDisciplinaCollection().remove(disciplina);
                    turmaCollectionOldTurma = em.merge(turmaCollectionOldTurma);
                }
            }
            for (Turma turmaCollectionNewTurma : turmaCollectionNew) {
                if (!turmaCollectionOld.contains(turmaCollectionNewTurma)) {
                    turmaCollectionNewTurma.getDisciplinaCollection().add(disciplina);
                    turmaCollectionNewTurma = em.merge(turmaCollectionNewTurma);
                }
            }
            for (Horario horarioCollectionOldHorario : horarioCollectionOld) {
                if (!horarioCollectionNew.contains(horarioCollectionOldHorario)) {
                    horarioCollectionOldHorario.getDisciplinaCollection().remove(disciplina);
                    horarioCollectionOldHorario = em.merge(horarioCollectionOldHorario);
                }
            }
            for (Horario horarioCollectionNewHorario : horarioCollectionNew) {
                if (!horarioCollectionOld.contains(horarioCollectionNewHorario)) {
                    horarioCollectionNewHorario.getDisciplinaCollection().add(disciplina);
                    horarioCollectionNewHorario = em.merge(horarioCollectionNewHorario);
                }
            }
            for (Professor professorCollectionOldProfessor : professorCollectionOld) {
                if (!professorCollectionNew.contains(professorCollectionOldProfessor)) {
                    professorCollectionOldProfessor.getDisciplinaCollection().remove(disciplina);
                    professorCollectionOldProfessor = em.merge(professorCollectionOldProfessor);
                }
            }
            for (Professor professorCollectionNewProfessor : professorCollectionNew) {
                if (!professorCollectionOld.contains(professorCollectionNewProfessor)) {
                    professorCollectionNewProfessor.getDisciplinaCollection().add(disciplina);
                    professorCollectionNewProfessor = em.merge(professorCollectionNewProfessor);
                }
            }
            for (Sala salaCollectionOldSala : salaCollectionOld) {
                if (!salaCollectionNew.contains(salaCollectionOldSala)) {
                    salaCollectionOldSala.getDisciplinaCollection().remove(disciplina);
                    salaCollectionOldSala = em.merge(salaCollectionOldSala);
                }
            }
            for (Sala salaCollectionNewSala : salaCollectionNew) {
                if (!salaCollectionOld.contains(salaCollectionNewSala)) {
                    salaCollectionNewSala.getDisciplinaCollection().add(disciplina);
                    salaCollectionNewSala = em.merge(salaCollectionNewSala);
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = disciplina.getDisciplinaId();
                if (findDisciplina(id) == null) {
                    throw new NonexistentEntityException("The disciplina with id " + id + " no longer exists.");
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
            Disciplina disciplina;
            try {
                disciplina = em.getReference(Disciplina.class, id);
                disciplina.getDisciplinaId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The disciplina with id " + id + " no longer exists.", enfe);
            }
            Collection<Turma> turmaCollection = disciplina.getTurmaCollection();
            for (Turma turmaCollectionTurma : turmaCollection) {
                turmaCollectionTurma.getDisciplinaCollection().remove(disciplina);
                turmaCollectionTurma = em.merge(turmaCollectionTurma);
            }
            Collection<Horario> horarioCollection = disciplina.getHorarioCollection();
            for (Horario horarioCollectionHorario : horarioCollection) {
                horarioCollectionHorario.getDisciplinaCollection().remove(disciplina);
                horarioCollectionHorario = em.merge(horarioCollectionHorario);
            }
            Collection<Professor> professorCollection = disciplina.getProfessorCollection();
            for (Professor professorCollectionProfessor : professorCollection) {
                professorCollectionProfessor.getDisciplinaCollection().remove(disciplina);
                professorCollectionProfessor = em.merge(professorCollectionProfessor);
            }
            Collection<Sala> salaCollection = disciplina.getSalaCollection();
            for (Sala salaCollectionSala : salaCollection) {
                salaCollectionSala.getDisciplinaCollection().remove(disciplina);
                salaCollectionSala = em.merge(salaCollectionSala);
            }
            em.remove(disciplina);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Disciplina> findDisciplinaEntities() {
        return findDisciplinaEntities(true, -1, -1);
    }

    public List<Disciplina> findDisciplinaEntities(int maxResults, int firstResult) {
        return findDisciplinaEntities(false, maxResults, firstResult);
    }

    private List<Disciplina> findDisciplinaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Disciplina.class));
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
    
    public List<Disciplina> findDisciplinasOrdered(){
        EntityManager em = getEntityManager();
        try {
            String sql = "SELECT d FROM Disciplina d ORDER BY d.disciplinaNome";
            Query query = em.createQuery(sql);
            return query.getResultList();
        } finally {
            em.close();
        }
    }

    public Disciplina findDisciplina(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Disciplina.class, id);
        } finally {
            em.close();
        }
    }

    public int getDisciplinaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Disciplina> rt = cq.from(Disciplina.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
}
