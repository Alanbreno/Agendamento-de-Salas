package DAO.Controladores;

import DAO.TurmaJpaController;
import Entidades.Turma;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

public class ControladorTurma extends TurmaJpaController{
    
    public List<Turma> selectTurmas(){
        EntityManager em = getEntityManager();
        try {
            String sql = "SELECT t FROM Turma t ORDER BY t.turmaCodigo";
            Query query = em.createQuery(sql);
            return query.getResultList();
        } finally {
            em.close();
        }
    }
    
}
