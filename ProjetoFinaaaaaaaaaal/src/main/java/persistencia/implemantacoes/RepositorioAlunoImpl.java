/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia.implemantacoes;

import Entity.Aluno;
import java.util.ArrayList;
import java.util.List;
import persistencia.comportamentos.RepositorioGenerico;


class RepositorioAlunoImpl implements RepositorioGenerico<Aluno, Integer> {
    private List<Aluno> listaAluno = null;
    
    protected RepositorioAlunoImpl(){
        this.listaAluno = new ArrayList<>();
    }
    
    @Override
    public void inserir(Aluno t) {
        this.listaAluno.add(t);
    }

    @Override
    public void alterar(Aluno t) {
        
        for(Aluno ta:this.listaAluno){
            
            if(ta.getMatrícula()==t.getMatrícula()){
                ta.setNome(t.getNome());
                ta.setEmail(t.getEmail());
                return;
            }            
        }       
    }

    @Override
    public Aluno recuperar(Integer g) {
        for(Aluno ta:this.listaAluno){
            if(ta.getMatrícula()==g){
                return ta;
            }
        }
        return null;
    }

    @Override
    public void excluir(Aluno t) {
        this.listaAluno.remove(t);
    }

    @Override
    public List<Aluno> recuperarTodos() {
        return this.listaAluno;
    }
    
}
