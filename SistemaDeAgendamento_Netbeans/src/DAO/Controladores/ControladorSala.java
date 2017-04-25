package DAO.Controladores;

import DAO.SalaJpaController;
import Entidades.Sala;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

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

}
