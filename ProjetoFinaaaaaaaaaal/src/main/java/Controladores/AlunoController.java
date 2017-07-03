/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Entity.Aluno;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import persistencia.comportamentos.RepositorioGenerico;
import persistencia.implemantacoes.FactoryRepositorio;

@ManagedBean
@SessionScoped
public class AlunoController {
    RepositorioGenerico<Aluno, Integer> repositorioAluno  = null;
    
    private Aluno selectedAluno;
    
    public AlunoController(){
      this.repositorioAluno = FactoryRepositorio.fabricarRepositorio(
               FactoryRepositorio.Aluno, FactoryRepositorio.BANCODADOS);
    }
    
    public String inserir(Aluno aluno) {
        this.repositorioAluno.inserir(aluno);
        return "index.xhtml";
        
    }

    public String alterar(Aluno aluno) {
        this.repositorioAluno.alterar(aluno);
        return "ApresentaAluno.xhtml";
    }

    public Aluno recuperarGUarda(int id) {
        return this.repositorioAluno.recuperar(id);
    }

    public void excluir(Aluno aluno) {
        this.repositorioAluno.excluir(aluno);
    }

    public List<Aluno> recuperarTodosAluno() {
        return this.repositorioAluno.recuperarTodos();
    }
     public Aluno recuperarAlunos(int matrícula){
        return this.repositorioAluno.recuperar(matrícula);
    }
    
    public Aluno getSelectedAluno() {
        return selectedAluno;
    }

    public void setSelectedAluno(Aluno selectedAluno) {
        this.selectedAluno= selectedAluno;
    }
    
}
