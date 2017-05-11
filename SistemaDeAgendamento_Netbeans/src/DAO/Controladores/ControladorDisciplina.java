package DAO.Controladores;

import DAO.DisciplinaJpaController;
import Entidades.Disciplina;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

public class ControladorDisciplina extends DisciplinaJpaController{

    public List<Disciplina> selectDisciplinas(){
        EntityManager em = getEntityManager();
        try {
            String sql = "SELECT d FROM Disciplina d ORDER BY d.disciplinaNome";
            Query query = em.createQuery(sql);
            return query.getResultList();
        } finally {
            em.close();
        }
    }
    
    public List<Disciplina> FiltroDisciplina(String disciplina){
        EntityManager em = getEntityManager();
        TypedQuery<Disciplina> query = em.createQuery("SELECT h FROM Disciplina h WHERE h.disciplinaCodigo = :disciplinaCodigo",Disciplina.class);
        query.setParameter("disciplinaCodigo", disciplina);
      
      return query.getResultList();
        
    }
    
}
