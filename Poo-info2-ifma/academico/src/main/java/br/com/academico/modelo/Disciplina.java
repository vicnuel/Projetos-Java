/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.academico.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author alunos
 */
@Entity
public class Disciplina {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private int cargaHoraria;
    private int cargaHorSemanal;
    @ManyToOne
    @JoinColumn(name="curso_id")
    private Curso curso;

    @ManyToOne
    @JoinColumn(name="areaconcentracao_id")
    private AreaConcentracao areaConcentracao;


    public Disciplina() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public int getCargaHorSemanal() {
        return cargaHorSemanal;
    }

    public void setCargaHorSemanal(int cargaHorSemanal) {
        this.cargaHorSemanal = cargaHorSemanal;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public AreaConcentracao getAreaConcentracao() {
        return areaConcentracao;
    }

    public void setAreaConcentracao(AreaConcentracao areaConcentracao) {
        this.areaConcentracao = areaConcentracao;
    }

    
       
    
    
}
