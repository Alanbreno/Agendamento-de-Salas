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
 * @author Alan Breno
 */
@Entity
@Table(name = "professor")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Professor.findAll", query = "SELECT p FROM Professor p"),
    @NamedQuery(name = "Professor.findByProfessorId", query = "SELECT p FROM Professor p WHERE p.professorId = :professorId"),
    @NamedQuery(name = "Professor.findByProfessorNome", query = "SELECT p FROM Professor p WHERE p.professorNome = :professorNome"),
    @NamedQuery(name = "Professor.findByProfessorTitulo", query = "SELECT p FROM Professor p WHERE p.professorTitulo = :professorTitulo"),
    @NamedQuery(name = "Professor.findByProfessorCargaHoraria", query = "SELECT p FROM Professor p WHERE p.professorCargaHoraria = :professorCargaHoraria"),
    @NamedQuery(name = "Professor.findByProfessorEspecializacao", query = "SELECT p FROM Professor p WHERE p.professorEspecializacao = :professorEspecializacao"),
    @NamedQuery(name = "Professor.findByProfessorStatus", query = "SELECT p FROM Professor p WHERE p.professorStatus = :professorStatus")})
public class Professor implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "professor_id")
    private Integer professorId;
    @Basic(optional = false)
    @Column(name = "professor_nome")
    private String professorNome;
    @Basic(optional = false)
    @Column(name = "professor_titulo")
    private String professorTitulo;
    @Basic(optional = false)
    @Column(name = "professor_carga_horaria")
    private short professorCargaHoraria;
    @Basic(optional = false)
    @Column(name = "professor_especializacao")
    private String professorEspecializacao;
    @Basic(optional = false)
    @Column(name = "professor_status")
    private boolean professorStatus;
    @ManyToMany(mappedBy = "professorCollection")
    private Collection<Horario> horarioCollection;
    @ManyToMany(mappedBy = "professorCollection")
    private Collection<Disciplina> disciplinaCollection;

    public Professor() {
    }

    public Professor(Integer professorId) {
        this.professorId = professorId;
    }

    public Professor(Integer professorId, String professorNome, String professorTitulo, short professorCargaHoraria, String professorEspecializacao, boolean professorStatus) {
        this.professorId = professorId;
        this.professorNome = professorNome;
        this.professorTitulo = professorTitulo;
        this.professorCargaHoraria = professorCargaHoraria;
        this.professorEspecializacao = professorEspecializacao;
        this.professorStatus = professorStatus;
    }

    public Integer getProfessorId() {
        return professorId;
    }

    public void setProfessorId(Integer professorId) {
        this.professorId = professorId;
    }

    public String getProfessorNome() {
        return professorNome;
    }

    public void setProfessorNome(String professorNome) {
        this.professorNome = professorNome;
    }

    public String getProfessorTitulo() {
        return professorTitulo;
    }

    public void setProfessorTitulo(String professorTitulo) {
        this.professorTitulo = professorTitulo;
    }

    public short getProfessorCargaHoraria() {
        return professorCargaHoraria;
    }

    public void setProfessorCargaHoraria(short professorCargaHoraria) {
        this.professorCargaHoraria = professorCargaHoraria;
    }

    public String getProfessorEspecializacao() {
        return professorEspecializacao;
    }

    public void setProfessorEspecializacao(String professorEspecializacao) {
        this.professorEspecializacao = professorEspecializacao;
    }

    public boolean getProfessorStatus() {
        return professorStatus;
    }

    public void setProfessorStatus(boolean professorStatus) {
        this.professorStatus = professorStatus;
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
        hash += (professorId != null ? professorId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Professor)) {
            return false;
        }
        Professor other = (Professor) object;
        if ((this.professorId == null && other.professorId != null) || (this.professorId != null && !this.professorId.equals(other.professorId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Professor[ professorId=" + professorId + " ]";
    }
    
}
