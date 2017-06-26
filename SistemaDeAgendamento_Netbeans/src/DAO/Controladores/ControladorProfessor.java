package DAO.Controladores;

import DAO.ProfessorJpaController;

import Entidades.Professor;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

public class ControladorProfessor extends ProfessorJpaController {

    public List<Professor> selectProfessores() {
        EntityManager em = getEntityManager();
        try {
            String sql = "SELECT p FROM Professor p ORDER BY p.professorNome";
            Query query = em.createQuery(sql);
            return query.getResultList();
        } finally {
            em.close();
        }
    }

    public List<Professor> FiltroProfessor(String disciplina) {
        EntityManager em = getEntityManager();
        TypedQuery<Professor> query = em.createQuery("SELECT h FROM Professor h WHERE h.professorNome = :professorNome", Professor.class);
        query.setParameter("professorNome", disciplina);

        return query.getResultList();

    }

    public List<Professor> filtroNomeProfessor(String nome) {
        EntityManager em = getEntityManager();
        TypedQuery<Professor> query = em.createQuery("SELECT p FROM Professor p WHERE p.professorNome LIKE :professorNome ORDER By p.professorNome ASC", Professor.class);
        query.setParameter("professorNome","%" + nome + "%");

        return query.getResultList();
    }

    public List<Professor> filtroTituloProfessor(String titulo) {
        EntityManager em = getEntityManager();
        TypedQuery<Professor> query = em.createQuery("SELECT p FROM Professor p WHERE p.professorTitulo LIKE :professorTitulo ORDER By p.professorTitulo ASC", Professor.class);
        query.setParameter("professorTitulo", titulo + "%");

        return query.getResultList();
    }

    public List<Professor> filtroEspecializaçaoProfessor(String area) {
        EntityManager em = getEntityManager();
        TypedQuery<Professor> query = em.createQuery("SELECT p FROM Professor p WHERE p.professorEspecializacao LIKE :professorEspecializacao ORDER By p.professorEspecializacao ASC", Professor.class);
        query.setParameter("professorEspecializacao", area + "%");

        return query.getResultList();
    }

    public List<Professor> filtroCargahorariaCumpridaProfessor(boolean horas) {
        EntityManager em = getEntityManager();
        TypedQuery<Professor> query = em.createQuery("SELECT p FROM Professor p WHERE p.professorStatus LIKE :professorStatus ORDER By p.professorStatus  ASC", Professor.class);
        query.setParameter("professorStatus", horas);

        return query.getResultList();
    }

}
