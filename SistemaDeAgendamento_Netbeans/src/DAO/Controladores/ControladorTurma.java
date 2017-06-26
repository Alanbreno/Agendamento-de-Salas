package DAO.Controladores;

import DAO.TurmaJpaController;

import Entidades.Turma;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

public class ControladorTurma extends TurmaJpaController {

    public List<Turma> selectTurmas() {
        EntityManager em = getEntityManager();
        try {
            String sql = "SELECT t FROM Turma t ORDER BY t.turmaCodigo";
            Query query = em.createQuery(sql);
            return query.getResultList();
        } finally {
            em.close();
        }
    }

    public List<Turma> FiltroTurma(String turma) {
        EntityManager em = getEntityManager();
        TypedQuery<Turma> query = em.createQuery("SELECT t FROM Turma t WHERE t.turmaCodigo = :turmaCodigo", Turma.class);
        query.setParameter("turmaCodigo", turma);

        return query.getResultList();
    }

    public List<Turma> FiltroCodigoTurma(String codigo) {
        EntityManager em = getEntityManager();
        TypedQuery<Turma> query = em.createQuery("SELECT t FROM Turma t WHERE t.turmaCodigo LIKE :turmaCodigo ORDER By t.turmaCodigo ASC", Turma.class);
        query.setParameter("turmaCodigo", codigo + "%");

        return query.getResultList();
    }

    public List<Turma> FiltroSemestreTurma(short semestre) {
        EntityManager em = getEntityManager();
        TypedQuery<Turma> query = em.createQuery("SELECT t FROM Turma t WHERE t.turmaSemestre LIKE :turmaSemestre ORDER By t.turmaSemestre ASC", Turma.class);
        query.setParameter("turmaSemestre", semestre);

        return query.getResultList();
    }

    public List<Turma> FiltroSalaStatusTurma(boolean status) {
        EntityManager em = getEntityManager();
        TypedQuery<Turma> query = em.createQuery("SELECT t FROM Turma t WHERE t.turmaStatus LIKE :turmaStatus ORDER By t.turmaStatus  ASC", Turma.class);
        query.setParameter("turmaStatus", status);

        return query.getResultList();
    }

    public List<Turma> FiltroNumeroAlunosTurma(short alunos) {
        EntityManager em = getEntityManager();
        TypedQuery<Turma> query = em.createQuery("SELECT t FROM Turma t WHERE t.turmaNumAluno = :turmaNumAluno ORDER By t.turmaNumAluno ASC", Turma.class);
        query.setParameter("turmaNumAluno", alunos);

        return query.getResultList();
    }

}
