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
@Table(name = "turma")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Turma.findAll", query = "SELECT t FROM Turma t"),
    @NamedQuery(name = "Turma.findByTurmaId", query = "SELECT t FROM Turma t WHERE t.turmaId = :turmaId"),
    @NamedQuery(name = "Turma.findByTurmaNumAluno", query = "SELECT t FROM Turma t WHERE t.turmaNumAluno = :turmaNumAluno"),
    @NamedQuery(name = "Turma.findByTurmaStatus", query = "SELECT t FROM Turma t WHERE t.turmaStatus = :turmaStatus"),
    @NamedQuery(name = "Turma.findByTurmaTurno", query = "SELECT t FROM Turma t WHERE t.turmaTurno = :turmaTurno"),
    @NamedQuery(name = "Turma.findByTurmaSemestre", query = "SELECT t FROM Turma t WHERE t.turmaSemestre = :turmaSemestre")})
public class Turma implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "turma_id")
    private Integer turmaId;
    @Basic(optional = false)
    @Column(name = "turma_num_aluno")
    private short turmaNumAluno;
    @Basic(optional = false)
    @Column(name = "turma_status")
    private boolean turmaStatus;
    @Basic(optional = false)
    @Column(name = "turma_turno")
    private String turmaTurno;
    @Basic(optional = false)
    @Column(name = "turma_semestre")
    private short turmaSemestre;
    @ManyToMany(mappedBy = "turmaCollection")
    private Collection<Disciplina> disciplinaCollection;

    public Turma() {
    }

    public Turma(Integer turmaId) {
        this.turmaId = turmaId;
    }

    public Turma(Integer turmaId, short turmaNumAluno, boolean turmaStatus, String turmaTurno, short turmaSemestre) {
        this.turmaId = turmaId;
        this.turmaNumAluno = turmaNumAluno;
        this.turmaStatus = turmaStatus;
        this.turmaTurno = turmaTurno;
        this.turmaSemestre = turmaSemestre;
    }

    public Integer getTurmaId() {
        return turmaId;
    }

    public void setTurmaId(Integer turmaId) {
        this.turmaId = turmaId;
    }

    public short getTurmaNumAluno() {
        return turmaNumAluno;
    }

    public void setTurmaNumAluno(short turmaNumAluno) {
        this.turmaNumAluno = turmaNumAluno;
    }

    public boolean getTurmaStatus() {
        return turmaStatus;
    }

    public void setTurmaStatus(boolean turmaStatus) {
        this.turmaStatus = turmaStatus;
    }

    public String getTurmaTurno() {
        return turmaTurno;
    }

    public void setTurmaTurno(String turmaTurno) {
        this.turmaTurno = turmaTurno;
    }

    public short getTurmaSemestre() {
        return turmaSemestre;
    }

    public void setTurmaSemestre(short turmaSemestre) {
        this.turmaSemestre = turmaSemestre;
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
        hash += (turmaId != null ? turmaId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Turma)) {
            return false;
        }
        Turma other = (Turma) object;
        if ((this.turmaId == null && other.turmaId != null) || (this.turmaId != null && !this.turmaId.equals(other.turmaId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Turma[ turmaId=" + turmaId + " ]";
    }
    
}
