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
import Entidades.Sala;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

/**
 *
 * @author jnts
 */
public class SalaJpaController implements Serializable {
    
    private EntityManagerFactory emf = null;
    
    public SalaJpaController() {
        this.emf = Persistence.createEntityManagerFactory("SistemaDeAgendamentoPU");
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
    
    public void create(Sala sala) {
        if (sala.getHorarioCollection() == null) {
            sala.setHorarioCollection(new ArrayList<Horario>());
        }
        if (sala.getDisciplinaCollection() == null) {
            sala.setDisciplinaCollection(new ArrayList<Disciplina>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Collection<Horario> attachedHorarioCollection = new ArrayList<Horario>();
            for (Horario horarioCollectionHorarioToAttach : sala.getHorarioCollection()) {
                horarioCollectionHorarioToAttach = em.getReference(horarioCollectionHorarioToAttach.getClass(), horarioCollectionHorarioToAttach.getHorarioId());
                attachedHorarioCollection.add(horarioCollectionHorarioToAttach);
            }
            sala.setHorarioCollection(attachedHorarioCollection);
            Collection<Disciplina> attachedDisciplinaCollection = new ArrayList<Disciplina>();
            for (Disciplina disciplinaCollectionDisciplinaToAttach : sala.getDisciplinaCollection()) {
                disciplinaCollectionDisciplinaToAttach = em.getReference(disciplinaCollectionDisciplinaToAttach.getClass(), disciplinaCollectionDisciplinaToAttach.getDisciplinaId());
                attachedDisciplinaCollection.add(disciplinaCollectionDisciplinaToAttach);
            }
            sala.setDisciplinaCollection(attachedDisciplinaCollection);
            em.persist(sala);
            for (Horario horarioCollectionHorario : sala.getHorarioCollection()) {
                horarioCollectionHorario.getSalaCollection().add(sala);
                horarioCollectionHorario = em.merge(horarioCollectionHorario);
            }
            for (Disciplina disciplinaCollectionDisciplina : sala.getDisciplinaCollection()) {
                disciplinaCollectionDisciplina.getSalaCollection().add(sala);
                disciplinaCollectionDisciplina = em.merge(disciplinaCollectionDisciplina);
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Sala sala) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Sala persistentSala = em.find(Sala.class, sala.getSalaId());
            Collection<Horario> horarioCollectionOld = persistentSala.getHorarioCollection();
            Collection<Horario> horarioCollectionNew = sala.getHorarioCollection();
            Collection<Disciplina> disciplinaCollectionOld = persistentSala.getDisciplinaCollection();
            Collection<Disciplina> disciplinaCollectionNew = sala.getDisciplinaCollection();
            Collection<Horario> attachedHorarioCollectionNew = new ArrayList<Horario>();
            for (Horario horarioCollectionNewHorarioToAttach : horarioCollectionNew) {
                horarioCollectionNewHorarioToAttach = em.getReference(horarioCollectionNewHorarioToAttach.getClass(), horarioCollectionNewHorarioToAttach.getHorarioId());
                attachedHorarioCollectionNew.add(horarioCollectionNewHorarioToAttach);
            }
            horarioCollectionNew = attachedHorarioCollectionNew;
            sala.setHorarioCollection(horarioCollectionNew);
            Collection<Disciplina> attachedDisciplinaCollectionNew = new ArrayList<Disciplina>();
            for (Disciplina disciplinaCollectionNewDisciplinaToAttach : disciplinaCollectionNew) {
                disciplinaCollectionNewDisciplinaToAttach = em.getReference(disciplinaCollectionNewDisciplinaToAttach.getClass(), disciplinaCollectionNewDisciplinaToAttach.getDisciplinaId());
                attachedDisciplinaCollectionNew.add(disciplinaCollectionNewDisciplinaToAttach);
            }
            disciplinaCollectionNew = attachedDisciplinaCollectionNew;
            sala.setDisciplinaCollection(disciplinaCollectionNew);
            sala = em.merge(sala);
            for (Horario horarioCollectionOldHorario : horarioCollectionOld) {
                if (!horarioCollectionNew.contains(horarioCollectionOldHorario)) {
                    horarioCollectionOldHorario.getSalaCollection().remove(sala);
                    horarioCollectionOldHorario = em.merge(horarioCollectionOldHorario);
                }
            }
            for (Horario horarioCollectionNewHorario : horarioCollectionNew) {
                if (!horarioCollectionOld.contains(horarioCollectionNewHorario)) {
                    horarioCollectionNewHorario.getSalaCollection().add(sala);
                    horarioCollectionNewHorario = em.merge(horarioCollectionNewHorario);
                }
            }
            for (Disciplina disciplinaCollectionOldDisciplina : disciplinaCollectionOld) {
                if (!disciplinaCollectionNew.contains(disciplinaCollectionOldDisciplina)) {
                    disciplinaCollectionOldDisciplina.getSalaCollection().remove(sala);
                    disciplinaCollectionOldDisciplina = em.merge(disciplinaCollectionOldDisciplina);
                }
            }
            for (Disciplina disciplinaCollectionNewDisciplina : disciplinaCollectionNew) {
                if (!disciplinaCollectionOld.contains(disciplinaCollectionNewDisciplina)) {
                    disciplinaCollectionNewDisciplina.getSalaCollection().add(sala);
                    disciplinaCollectionNewDisciplina = em.merge(disciplinaCollectionNewDisciplina);
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = sala.getSalaId();
                if (findSala(id) == null) {
                    throw new NonexistentEntityException("The sala with id " + id + " no longer exists.");
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
            Sala sala;
            try {
                sala = em.getReference(Sala.class, id);
                sala.getSalaId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The sala with id " + id + " no longer exists.", enfe);
            }
            Collection<Horario> horarioCollection = sala.getHorarioCollection();
            for (Horario horarioCollectionHorario : horarioCollection) {
                horarioCollectionHorario.getSalaCollection().remove(sala);
                horarioCollectionHorario = em.merge(horarioCollectionHorario);
            }
            Collection<Disciplina> disciplinaCollection = sala.getDisciplinaCollection();
            for (Disciplina disciplinaCollectionDisciplina : disciplinaCollection) {
                disciplinaCollectionDisciplina.getSalaCollection().remove(sala);
                disciplinaCollectionDisciplina = em.merge(disciplinaCollectionDisciplina);
            }
            em.remove(sala);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Sala> findSalaEntities() {
        return findSalaEntities(true, -1, -1);
    }

    public List<Sala> findSalaEntities(int maxResults, int firstResult) {
        return findSalaEntities(false, maxResults, firstResult);
    }

    private List<Sala> findSalaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Sala.class));
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

    public Sala findSala(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Sala.class, id);
        } finally {
            em.close();
        }
    }

    public int getSalaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Sala> rt = cq.from(Sala.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
    
    
}
