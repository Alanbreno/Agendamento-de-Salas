/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author jnts
 */
@Entity
@Table(name = "sala")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sala.findAll", query = "SELECT s FROM Sala s"),
    @NamedQuery(name = "Sala.findBySalaId", query = "SELECT s FROM Sala s WHERE s.salaId = :salaId"),
    @NamedQuery(name = "Sala.findBySalaCodigo", query = "SELECT s FROM Sala s WHERE s.salaCodigo = :salaCodigo"),
    @NamedQuery(name = "Sala.findBySalaNumAluno", query = "SELECT s FROM Sala s WHERE s.salaNumAluno = :salaNumAluno"),
    @NamedQuery(name = "Sala.findBySalaLocalizacao", query = "SELECT s FROM Sala s WHERE s.salaLocalizacao = :salaLocalizacao"),
    @NamedQuery(name = "Sala.findBySalaObservacao", query = "SELECT s FROM Sala s WHERE s.salaObservacao = :salaObservacao")})
public class Sala implements Serializable {

    @Basic(optional = false)
    @Column(name = "sala_laboratorio")
    private boolean salaLaboratorio;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "sala_id")
    private Integer salaId;
    @Basic(optional = false)
    @Column(name = "sala_codigo")
    private String salaCodigo;
    @Basic(optional = false)
    @Column(name = "sala_num_aluno")
    private short salaNumAluno;
    @Basic(optional = false)
    @Column(name = "sala_localizacao")
    private String salaLocalizacao;
    @Column(name = "sala_observacao")
    private String salaObservacao;
    @ManyToMany(mappedBy = "salaCollection")
    private Collection<Horario> horarioCollection;
    @ManyToMany(mappedBy = "salaCollection")
    private Collection<Disciplina> disciplinaCollection;

    public Sala() {
    }

    public Sala(Integer salaId) {
        this.salaId = salaId;
    }

    public Sala(Integer salaId, String salaCodigo, short salaNumAluno, String salaLocalizacao) {
        this.salaId = salaId;
        this.salaCodigo = salaCodigo;
        this.salaNumAluno = salaNumAluno;
        this.salaLocalizacao = salaLocalizacao;
    }

    public Integer getSalaId() {
        return salaId;
    }

    public void setSalaId(Integer salaId) {
        this.salaId = salaId;
    }

    public String getSalaCodigo() {
        return salaCodigo;
    }

    public void setSalaCodigo(String salaCodigo) {
        this.salaCodigo = salaCodigo;
    }

    public short getSalaNumAluno() {
        return salaNumAluno;
    }

    public void setSalaNumAluno(short salaNumAluno) {
        this.salaNumAluno = salaNumAluno;
    }

    public String getSalaLocalizacao() {
        return salaLocalizacao;
    }

    public void setSalaLocalizacao(String salaLocalizacao) {
        this.salaLocalizacao = salaLocalizacao;
    }

    public String getSalaObservacao() {
        return salaObservacao;
    }

    public void setSalaObservacao(String salaObservacao) {
        this.salaObservacao = salaObservacao;
    }

    @XmlTransient
    public Collection<Horario> getHorarioCollection() {
        return horarioCollection;
    }

    public void setHorarioCollection(Collection<Horario> horarioCollection) {
        this.horarioCollection = horarioCollection;
    }

    @XmlTransient
    public Collection<Disciplina> getDisciplinaCollection() {
        return disciplinaCollection;
    }

    public void setDisciplinaCollection(Collection<Disciplina> disciplinaCollection) {
        this.disciplinaCollection = disciplinaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (salaId != null ? salaId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sala)) {
            return false;
        }
        Sala other = (Sala) object;
        if ((this.salaId == null && other.salaId != null) || (this.salaId != null && !this.salaId.equals(other.salaId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Sala[ salaId=" + salaId + " ]";
    }

    public boolean getSalaLaboratorio() {
        return salaLaboratorio;
    }

    public void setSalaLaboratorio(boolean salaLaboratorio) {
        this.salaLaboratorio = salaLaboratorio;
    }
    
}
