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
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
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
@Table(name = "disciplina")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Disciplina.findAll", query = "SELECT d FROM Disciplina d"),
    @NamedQuery(name = "Disciplina.findByDisciplinaId", query = "SELECT d FROM Disciplina d WHERE d.disciplinaId = :disciplinaId"),
    @NamedQuery(name = "Disciplina.findByDisciplinaNome", query = "SELECT d FROM Disciplina d WHERE d.disciplinaNome = :disciplinaNome"),
    @NamedQuery(name = "Disciplina.findByDisciplinaCargaHoraria", query = "SELECT d FROM Disciplina d WHERE d.disciplinaCargaHoraria = :disciplinaCargaHoraria"),
    @NamedQuery(name = "Disciplina.findByDisciplinaSemestre", query = "SELECT d FROM Disciplina d WHERE d.disciplinaSemestre = :disciplinaSemestre"),
    @NamedQuery(name = "Disciplina.findByDisciplinaSubTurma", query = "SELECT d FROM Disciplina d WHERE d.disciplinaSubTurma = :disciplinaSubTurma"),
    @NamedQuery(name = "Disciplina.findByDisciplinaNumAluno", query = "SELECT d FROM Disciplina d WHERE d.disciplinaNumAluno = :disciplinaNumAluno"),
    @NamedQuery(name = "Disciplina.findByDisciplinaStatus", query = "SELECT d FROM Disciplina d WHERE d.disciplinaStatus = :disciplinaStatus"),
    @NamedQuery(name = "Disciplina.findByDisciplinaC\u00f3digo", query = "SELECT d FROM Disciplina d WHERE d.disciplinaC\u00f3digo = :disciplinaC\u00f3digo")})
public class Disciplina implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "disciplina_id")
    private Integer disciplinaId;
    @Basic(optional = false)
    @Column(name = "disciplina_nome")
    private String disciplinaNome;
    @Basic(optional = false)
    @Column(name = "disciplina_carga_horaria")
    private short disciplinaCargaHoraria;
    @Basic(optional = false)
    @Column(name = "disciplina_semestre")
    private short disciplinaSemestre;
    @Basic(optional = false)
    @Column(name = "disciplina_sub_turma")
    private boolean disciplinaSubTurma;
    @Basic(optional = false)
    @Column(name = "disciplina_num_aluno")
    private short disciplinaNumAluno;
    @Basic(optional = false)
    @Column(name = "disciplina_status")
    private boolean disciplinaStatus;
    @Basic(optional = false)
    @Column(name = "disciplina_c\u00f3digo")
    private String disciplinaCódigo;
    @JoinTable(name = "disciplina_turma", joinColumns = {
        @JoinColumn(name = "disciplina_id", referencedColumnName = "disciplina_id")}, inverseJoinColumns = {
        @JoinColumn(name = "turma_id", referencedColumnName = "turma_id")})
    @ManyToMany
    private Collection<Turma> turmaCollection;
    @JoinTable(name = "disciplina_horario", joinColumns = {
        @JoinColumn(name = "disciplina_id", referencedColumnName = "disciplina_id")}, inverseJoinColumns = {
        @JoinColumn(name = "horario_id", referencedColumnName = "horario_id")})
    @ManyToMany
    private Collection<Horario> horarioCollection;
    @JoinTable(name = "disciplina_professor", joinColumns = {
        @JoinColumn(name = "disciplina_id", referencedColumnName = "disciplina_id")}, inverseJoinColumns = {
        @JoinColumn(name = "professor_id", referencedColumnName = "professor_id")})
    @ManyToMany
    private Collection<Professor> professorCollection;
    @JoinTable(name = "disciplina_sala", joinColumns = {
        @JoinColumn(name = "disciplina_id", referencedColumnName = "disciplina_id")}, inverseJoinColumns = {
        @JoinColumn(name = "sala_id", referencedColumnName = "sala_id")})
    @ManyToMany
    private Collection<Sala> salaCollection;

    public Disciplina() {
    }

    public Disciplina(Integer disciplinaId) {
        this.disciplinaId = disciplinaId;
    }

    public Disciplina(Integer disciplinaId, String disciplinaNome, short disciplinaCargaHoraria, short disciplinaSemestre, boolean disciplinaSubTurma, short disciplinaNumAluno, boolean disciplinaStatus, String disciplinaCódigo) {
        this.disciplinaId = disciplinaId;
        this.disciplinaNome = disciplinaNome;
        this.disciplinaCargaHoraria = disciplinaCargaHoraria;
        this.disciplinaSemestre = disciplinaSemestre;
        this.disciplinaSubTurma = disciplinaSubTurma;
        this.disciplinaNumAluno = disciplinaNumAluno;
        this.disciplinaStatus = disciplinaStatus;
        this.disciplinaCódigo = disciplinaCódigo;
    }

    public Integer getDisciplinaId() {
        return disciplinaId;
    }

    public void setDisciplinaId(Integer disciplinaId) {
        this.disciplinaId = disciplinaId;
    }

    public String getDisciplinaNome() {
        return disciplinaNome;
    }

    public void setDisciplinaNome(String disciplinaNome) {
        this.disciplinaNome = disciplinaNome;
    }

    public short getDisciplinaCargaHoraria() {
        return disciplinaCargaHoraria;
    }

    public void setDisciplinaCargaHoraria(short disciplinaCargaHoraria) {
        this.disciplinaCargaHoraria = disciplinaCargaHoraria;
    }

    public short getDisciplinaSemestre() {
        return disciplinaSemestre;
    }

    public void setDisciplinaSemestre(short disciplinaSemestre) {
        this.disciplinaSemestre = disciplinaSemestre;
    }

    public boolean getDisciplinaSubTurma() {
        return disciplinaSubTurma;
    }

    public void setDisciplinaSubTurma(boolean disciplinaSubTurma) {
        this.disciplinaSubTurma = disciplinaSubTurma;
    }

    public short getDisciplinaNumAluno() {
        return disciplinaNumAluno;
    }

    public void setDisciplinaNumAluno(short disciplinaNumAluno) {
        this.disciplinaNumAluno = disciplinaNumAluno;
    }

    public boolean getDisciplinaStatus() {
        return disciplinaStatus;
    }

    public void setDisciplinaStatus(boolean disciplinaStatus) {
        this.disciplinaStatus = disciplinaStatus;
    }

    public String getDisciplinaCódigo() {
        return disciplinaCódigo;
    }

    public void setDisciplinaCódigo(String disciplinaCódigo) {
        this.disciplinaCódigo = disciplinaCódigo;
    }

    @XmlTransient
    public Collection<Turma> getTurmaCollection() {
        return turmaCollection;
    }

    public void setTurmaCollection(Collection<Turma> turmaCollection) {
        this.turmaCollection = turmaCollection;
    }

    @XmlTransient
    public Collection<Horario> getHorarioCollection() {
        return horarioCollection;
    }

    public void setHorarioCollection(Collection<Horario> horarioCollection) {
        this.horarioCollection = horarioCollection;
    }

    @XmlTransient
    public Collection<Professor> getProfessorCollection() {
        return professorCollection;
    }

    public void setProfessorCollection(Collection<Professor> professorCollection) {
        this.professorCollection = professorCollection;
    }

    @XmlTransient
    public Collection<Sala> getSalaCollection() {
        return salaCollection;
    }

    public void setSalaCollection(Collection<Sala> salaCollection) {
        this.salaCollection = salaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (disciplinaId != null ? disciplinaId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Disciplina)) {
            return false;
        }
        Disciplina other = (Disciplina) object;
        if ((this.disciplinaId == null && other.disciplinaId != null) || (this.disciplinaId != null && !this.disciplinaId.equals(other.disciplinaId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Disciplina[ disciplinaId=" + disciplinaId + " ]";
    }
    
}
