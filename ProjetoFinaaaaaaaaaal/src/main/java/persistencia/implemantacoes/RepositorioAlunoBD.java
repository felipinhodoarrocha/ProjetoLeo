/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia.implemantacoes;

import Dao.DaoManagerHiber;
import Entity.Aluno;
import java.util.List;
import persistencia.comportamentos.RepositorioGenerico;

class RepositorioAlunoBD implements RepositorioGenerico<Aluno, Integer> {
    
    @Override
    public void inserir(Aluno t) {
        DaoManagerHiber.getInstance().persist(t);
    }

    @Override
    public void alterar(Aluno t) {
        DaoManagerHiber.getInstance().update(t);    }

    @Override
    public Aluno recuperar(Integer g) {
        try{
        return (Aluno)DaoManagerHiber.getInstance().recover("from Aluno where codigo=" +g).get(0);
    }catch(IndexOutOfBoundsException e){
        return null;
        }
    }

    @Override
    public void excluir(Aluno t) {
        DaoManagerHiber.getInstance().delete(t);    }

    @Override
    public List<Aluno> recuperarTodos() {
        return DaoManagerHiber.getInstance().recover("from aluno");    
    }   
}
