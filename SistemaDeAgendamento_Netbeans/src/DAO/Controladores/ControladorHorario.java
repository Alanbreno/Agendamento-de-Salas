package DAO.Controladores;

import DAO.HorarioJpaController;
import Entidades.Horario;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

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
    
    public List<Horario> FiltroHora(Date hora){
          EntityManager em = getEntityManager();
       TypedQuery<Horario> query = em.createQuery("SELECT h FROM Horario h WHERE h.horarioInicial = :horarioInicial",Horario.class);
       query.setParameter("horarioInicial", hora);
        
      return query.getResultList();
        
    }
    
}
