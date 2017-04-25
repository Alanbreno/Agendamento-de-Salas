package DAO.Controladores;

import DAO.ProfessorJpaController;
import Entidades.Professor;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

public class ControladorProfessor extends ProfessorJpaController{
    
    public List<Professor> selectProfessores(){
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
