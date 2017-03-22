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
import Entidades.Disciplina;
import Entidades.Turma;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Alan Breno
 */
public class TurmaJpaController implements Serializable {

    public TurmaJpaController() {
        this.emf = Persistence.createEntityManagerFactory("SistemaDeAgendamentoPU");
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Turma turma) {
        if (turma.getDisciplinaCollection() == null) {
            turma.setDisciplinaCollection(new ArrayList<Disciplina>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Collection<Disciplina> attachedDisciplinaCollection = new ArrayList<Disciplina>();
            for (Disciplina disciplinaCollectionDisciplinaToAttach : turma.getDisciplinaCollection()) {
                disciplinaCollectionDisciplinaToAttach = em.getReference(disciplinaCollectionDisciplinaToAttach.getClass(), disciplinaCollectionDisciplinaToAttach.getDisciplinaId());
                attachedDisciplinaCollection.add(disciplinaCollectionDisciplinaToAttach);
            }
            turma.setDisciplinaCollection(attachedDisciplinaCollection);
            em.persist(turma);
            for (Disciplina disciplinaCollectionDisciplina : turma.getDisciplinaCollection()) {
                disciplinaCollectionDisciplina.getTurmaCollection().add(turma);
                disciplinaCollectionDisciplina = em.merge(disciplinaCollectionDisciplina);
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Turma turma) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Turma persistentTurma = em.find(Turma.class, turma.getTurmaId());
            Collection<Disciplina> disciplinaCollectionOld = persistentTurma.getDisciplinaCollection();
            Collection<Disciplina> disciplinaCollectionNew = turma.getDisciplinaCollection();
            Collection<Disciplina> attachedDisciplinaCollectionNew = new ArrayList<Disciplina>();
            for (Disciplina disciplinaCollectionNewDisciplinaToAttach : disciplinaCollectionNew) {
                disciplinaCollectionNewDisciplinaToAttach = em.getReference(disciplinaCollectionNewDisciplinaToAttach.getClass(), disciplinaCollectionNewDisciplinaToAttach.getDisciplinaId());
                attachedDisciplinaCollectionNew.add(disciplinaCollectionNewDisciplinaToAttach);
            }
            disciplinaCollectionNew = attachedDisciplinaCollectionNew;
            turma.setDisciplinaCollection(disciplinaCollectionNew);
            turma = em.merge(turma);
            for (Disciplina disciplinaCollectionOldDisciplina : disciplinaCollectionOld) {
                if (!disciplinaCollectionNew.contains(disciplinaCollectionOldDisciplina)) {
                    disciplinaCollectionOldDisciplina.getTurmaCollection().remove(turma);
                    disciplinaCollectionOldDisciplina = em.merge(disciplinaCollectionOldDisciplina);
                }
            }
            for (Disciplina disciplinaCollectionNewDisciplina : disciplinaCollectionNew) {
                if (!disciplinaCollectionOld.contains(disciplinaCollectionNewDisciplina)) {
                    disciplinaCollectionNewDisciplina.getTurmaCollection().add(turma);
                    disciplinaCollectionNewDisciplina = em.merge(disciplinaCollectionNewDisciplina);
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = turma.getTurmaId();
                if (findTurma(id) == null) {
                    throw new NonexistentEntityException("The turma with id " + id + " no longer exists.");
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
            Turma turma;
            try {
                turma = em.getReference(Turma.class, id);
                turma.getTurmaId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The turma with id " + id + " no longer exists.", enfe);
            }
            Collection<Disciplina> disciplinaCollection = turma.getDisciplinaCollection();
            for (Disciplina disciplinaCollectionDisciplina : disciplinaCollection) {
                disciplinaCollectionDisciplina.getTurmaCollection().remove(turma);
                disciplinaCollectionDisciplina = em.merge(disciplinaCollectionDisciplina);
            }
            em.remove(turma);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Turma> findTurmaEntities() {
        return findTurmaEntities(true, -1, -1);
    }

    public List<Turma> findTurmaEntities(int maxResults, int firstResult) {
        return findTurmaEntities(false, maxResults, firstResult);
    }

    private List<Turma> findTurmaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Turma.class));
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

    public Turma findTurma(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Turma.class, id);
        } finally {
            em.close();
        }
    }

    public int getTurmaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Turma> rt = cq.from(Turma.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
