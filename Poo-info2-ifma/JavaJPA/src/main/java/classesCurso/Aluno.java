/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classesCurso;

import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 *
 * @author ve495
 */
@Entity
public class Aluno {
    @Id
    @Column(name = "id_aluno")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nome_aluno", nullable=false, length=50)
    private String nome;
    @Column(name = "sexo_aluno", nullable=false, length=3)
    private String sexo;
    @Temporal(TemporalType.DATE)
    private Date dtNacimento;
    @OneToMany(mappedBy = "aluno", cascade = CascadeType.ALL)//@JoinTable(name = "a_assiste_c", joinColumns = {@JoinColumn(name = "aluno_id")}, inverseJoinColumns = {@JoinColumn(name = "curso_id")})
    private List<Curso> cursos;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Date getDtNacimento() {
        return dtNacimento;
    }

    public void setDtNacimento(Date dtNacimento) {
        this.dtNacimento = dtNacimento;
    }

    public List<Curso> getCurso() {
        return cursos;
    }

    public void setCurso(List<Curso> curso) {
        this.cursos = curso;
    }
    
    
    

}
