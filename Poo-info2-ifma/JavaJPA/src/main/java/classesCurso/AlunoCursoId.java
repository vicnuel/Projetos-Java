/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classesCurso;

import java.io.Serializable;

/**
 *
 * @author ve495
 */
public class AlunoCursoId implements Serializable {
    private static final long SarialVersiomUID = 1l;
    
    private int aluno;
    private int curso;

    public int getAluno() {
        return aluno;
    }

    public void setAluno(int aluno) {
        this.aluno = aluno;
    }

    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }
    
    

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Object) {
            AlunoCursoId alunoCursoId = (AlunoCursoId) obj;
            
        }
        return false;
    }

    @Override
    public int hashCode() {
        return aluno + curso;
    }
    
    
}
