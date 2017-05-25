package DAO.Controladores;

import DAO.SalaJpaController;
import Entidades.Sala;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

public class ControladorSala extends SalaJpaController {

    public List<Sala> selectSalas() {
        EntityManager em = getEntityManager();
        try {
            String sql = "SELECT s FROM Sala s ORDER BY s.salaCodigo";
            Query query = em.createQuery(sql);
            return query.getResultList();
        } finally {
            em.close();
        }
    }

    public List<Sala> FiltroSala(String sala) {
        EntityManager em = getEntityManager();
        TypedQuery<Sala> query = em.createQuery("SELECT s FROM Sala s WHERE s.salaCodigo = :salaCodigo", Sala.class);
        query.setParameter("salaCodigo", sala);

        return query.getResultList();
    }

    public List<Sala> filtroNomeSala(String sala) {
        EntityManager em = getEntityManager();
        TypedQuery<Sala> query = em.createQuery("SELECT s FROM Sala s WHERE s.salaCodigo LIKE :salaCodigo ORDER By s.salaCodigo ASC", Sala.class);
        query.setParameter("salaCodigo", sala + "%");
        return query.getResultList();
    }

    public List<Sala> filtroObservacaoSala(String obser) {
        EntityManager em = getEntityManager();
        TypedQuery<Sala> query = em.createQuery("SELECT s FROM Sala s WHERE s.salaObservacao LIKE :salaObservacao ORDER By s.salaObservacao ASC", Sala.class);
        query.setParameter("salaObservacao", obser + "%");

        return query.getResultList();
    }

    public List<Sala> filtroCapacidadeSala(short numero) {
        EntityManager em = getEntityManager();
        TypedQuery<Sala> query = em.createQuery("SELECT s FROM Sala s WHERE s.salaNumAluno LIKE :salaNumAluno ORDER By s.salaNumAluno ASC", Sala.class);
        query.setParameter("salaNumAluno", numero);

        return query.getResultList();
    }

    public List<Sala> filtroLocalizaçaoSala(String local) {
        EntityManager em = getEntityManager();
        TypedQuery<Sala> query = em.createQuery("SELECT s FROM Sala s WHERE s.salaLocalizacao LIKE :salaLocalizacao ORDER By s.salaLocalizacao ASC", Sala.class);
        query.setParameter("salaLocalizacao", local + "%");

        return query.getResultList();
    }

}
