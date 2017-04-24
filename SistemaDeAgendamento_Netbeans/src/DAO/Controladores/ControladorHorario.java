package DAO.Controladores;

import DAO.HorarioJpaController;
import Entidades.Horario;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

public class ControladorHorario extends HorarioJpaController{
    
    public List<Horario> selectHorarios(){
        EntityManager em = getEntityManager();
        try {
            String sql = "SELECT h FROM Horario h ORDER BY h.horarioInicial";
            Query query = em.createQuery(sql);
            return query.getResultList();
            
        } finally {
            em.close();
        }
    }
    
}
