/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author jnts
 */
@Entity
@Table(name = "horario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Horario.findAll", query = "SELECT h FROM Horario h"),
    @NamedQuery(name = "Horario.findByHorarioId", query = "SELECT h FROM Horario h WHERE h.horarioId = :horarioId"),
    @NamedQuery(name = "Horario.findByHorarioInicial", query = "SELECT h FROM Horario h WHERE h.horarioInicial = :horarioInicial"),
    @NamedQuery(name = "Horario.findByHorarioFinal", query = "SELECT h FROM Horario h WHERE h.horarioFinal = :horarioFinal")})
public class Horario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "horario_id")
    private Integer horarioId;
    @Basic(optional = false)
    @Column(name = "horario_inicial")
    @Temporal(TemporalType.TIME)
    private Date horarioInicial;
    @Basic(optional = false)
    @Column(name = "horario_final")
    @Temporal(TemporalType.TIME)
    private Date horarioFinal;
    @JoinTable(name = "sala_horario", joinColumns = {
        @JoinColumn(name = "horario_id", referencedColumnName = "horario_id")}, inverseJoinColumns = {
        @JoinColumn(name = "sala_id", referencedColumnName = "sala_id")})
    @ManyToMany
    private Collection<Sala> salaCollection;
    @ManyToMany(mappedBy = "horarioCollection")
    private Collection<Disciplina> disciplinaCollection;
    @JoinTable(name = "professor_horario", joinColumns = {
        @JoinColumn(name = "horario_id", referencedColumnName = "horario_id")}, inverseJoinColumns = {
        @JoinColumn(name = "professor_id", referencedColumnName = "professor_id")})
    @ManyToMany
    private Collection<Professor> professorCollection;

    public Horario() {
    }

    public Horario(Integer horarioId) {
        this.horarioId = horarioId;
    }

    public Horario(Integer horarioId, Date horarioInicial, Date horarioFinal) {
        this.horarioId = horarioId;
        this.horarioInicial = horarioInicial;
        this.horarioFinal = horarioFinal;
    }

    public Integer getHorarioId() {
        return horarioId;
    }

    public void setHorarioId(Integer horarioId) {
        this.horarioId = horarioId;
    }

    public Date getHorarioInicial() {
        return horarioInicial;
    }

    public void setHorarioInicial(Date horarioInicial) {
        this.horarioInicial = horarioInicial;
    }

    public Date getHorarioFinal() {
        return horarioFinal;
    }

    public void setHorarioFinal(Date horarioFinal) {
        this.horarioFinal = horarioFinal;
    }

    @XmlTransient
    public Collection<Sala> getSalaCollection() {
        return salaCollection;
    }

    public void setSalaCollection(Collection<Sala> salaCollection) {
        this.salaCollection = salaCollection;
    }

    @XmlTransient
    public Collection<Disciplina> getDisciplinaCollection() {
        return disciplinaCollection;
    }

    public void setDisciplinaCollection(Collection<Disciplina> disciplinaCollection) {
        this.disciplinaCollection = disciplinaCollection;
    }

    @XmlTransient
    public Collection<Professor> getProfessorCollection() {
        return professorCollection;
    }

    public void setProfessorCollection(Collection<Professor> professorCollection) {
        this.professorCollection = professorCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (horarioId != null ? horarioId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Horario)) {
            return false;
        }
        Horario other = (Horario) object;
        if ((this.horarioId == null && other.horarioId != null) || (this.horarioId != null && !this.horarioId.equals(other.horarioId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Horario[ horarioId=" + horarioId + " ]";
    }
    
}
