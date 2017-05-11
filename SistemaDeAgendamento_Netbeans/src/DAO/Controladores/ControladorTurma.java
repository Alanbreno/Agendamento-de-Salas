package DAO.Controladores;

import DAO.TurmaJpaController;
import Entidades.Sala;
import Entidades.Turma;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

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
    
    public List<Turma> FiltroTurma(String turma){
          EntityManager em = getEntityManager();
       TypedQuery<Turma> query = em.createQuery("SELECT t FROM Turma t WHERE t.turmaCodigo = :turmaCodigo",Turma.class);
       query.setParameter("turmaCodigo", turma);
      
      return query.getResultList();
    }
    
}
