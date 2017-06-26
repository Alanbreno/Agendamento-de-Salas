package DAO.Controladores;

import DAO.DisciplinaJpaController;
import Entidades.Disciplina;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

public class ControladorDisciplina extends DisciplinaJpaController {

    public List<Disciplina> selectDisciplinas() {
        EntityManager em = getEntityManager();
        try {
            String sql = "SELECT d FROM Disciplina d ORDER BY d.disciplinaNome";
            Query query = em.createQuery(sql);
            return query.getResultList();
        } finally {
            em.close();
        }
    }

    public List<Disciplina> FiltroDisciplina(String disciplina) {
        EntityManager em = getEntityManager();
        TypedQuery<Disciplina> query = em.createQuery("SELECT h FROM Disciplina h WHERE h.disciplinaCodigo = :disciplinaCodigo", Disciplina.class);
        query.setParameter("disciplinaCodigo", disciplina);

        return query.getResultList();

    }

    public List<Disciplina> filtroNomeDisciplina(String nome) {
        EntityManager em = getEntityManager();
        TypedQuery<Disciplina> query = em.createQuery("SELECT d FROM Disciplina d WHERE d.disciplinaNome LIKE :disciplinaNome ORDER By d.disciplinaNome ASC", Disciplina.class);
        query.setParameter("disciplinaNome",nome + "%");

        return query.getResultList();
    }

    public List<Disciplina> FiltroSemestreDisciplina(short semestre) {
        EntityManager em = getEntityManager();
        TypedQuery<Disciplina> query = em.createQuery("SELECT d FROM Disciplina d WHERE d.disciplinaSemestre LIKE :disciplinaSemestre ORDER By d.disciplinaSemestre ASC", Disciplina.class);
        query.setParameter("disciplinaSemestre", semestre);

        return query.getResultList();
    }

    public List<Disciplina> FiltroAlunosDisciplina(short alunos) {
        EntityManager em = getEntityManager();
        TypedQuery<Disciplina> query = em.createQuery("SELECT d FROM Disciplina d WHERE d.disciplinaNumAluno LIKE :disciplinaNumAluno ORDER By d.disciplinaNumAluno ASC", Disciplina.class);
        query.setParameter("disciplinaNumAluno", alunos);

        return query.getResultList();
    }

    public List<Disciplina> FiltroSubturmaDisciplina(boolean subturma) {
        EntityManager em = getEntityManager();
        TypedQuery<Disciplina> query = em.createQuery("SELECT d FROM Disciplina d WHERE d.disciplinaSubTurma LIKE :disciplinaSubTurma ORDER By d.disciplinaSubTurma ASC", Disciplina.class);
        query.setParameter("disciplinaSubTurma", subturma);

        return query.getResultList();
    }

    public List<Disciplina> FiltroCargaHorariaDisciplina(short carga) {
        EntityManager em = getEntityManager();
        TypedQuery<Disciplina> query = em.createQuery("SELECT d FROM Disciplina d WHERE d.disciplinaCargaHoraria LIKE :disciplinaCargaHoraria ORDER By d.disciplinaCargaHoraria ASC", Disciplina.class);
        query.setParameter("disciplinaCargaHoraria", carga);

        return query.getResultList();
    }

    public List<Disciplina> FiltroCodigoDisciplina(String codigo) {
        EntityManager em = getEntityManager();
        TypedQuery<Disciplina> query = em.createQuery("SELECT d FROM Disciplina d WHERE d.disciplinaCodigo LIKE :disciplinaCodigo ORDER By d.disciplinaCodigo ASC", Disciplina.class);
        query.setParameter("disciplinaCodigo", codigo + "%");

        return query.getResultList();
    }
     

}
