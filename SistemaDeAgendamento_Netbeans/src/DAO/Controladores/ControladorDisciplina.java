package DAO.Controladores;

import DAO.DisciplinaJpaController;
import Entidades.Disciplina;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

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
    
}
