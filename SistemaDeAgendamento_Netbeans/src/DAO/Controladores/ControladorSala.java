package DAO.Controladores;

import DAO.SalaJpaController;
import Entidades.Sala;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

public class ControladorSala extends SalaJpaController {
    
    public List<Sala> selectSalas(){
        EntityManager em = getEntityManager();
        try {
            String sql = "SELECT s FROM Sala s ORDER BY s.salaCodigo";
            Query query = em.createQuery(sql);
            return query.getResultList();
        } finally {
            em.close();
        }
    }
    
    public List<Sala> FiltroSala(String sala){
        EntityManager em = getEntityManager();
        TypedQuery<Sala> query = em.createQuery("SELECT s FROM Sala s WHERE s.salaCodigo = :salaCodigo",Sala.class);
        query.setParameter("salaCodigo", sala);
      
      return query.getResultList();
    }

}
