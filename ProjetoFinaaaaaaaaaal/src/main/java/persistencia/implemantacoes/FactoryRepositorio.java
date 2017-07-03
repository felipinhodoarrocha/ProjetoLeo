
package persistencia.implemantacoes;

import persistencia.comportamentos.RepositorioGenerico;

public class FactoryRepositorio {
    public static final int Aluno = 1;
    //As impl.
    public static final int BANCODADOS = 1;
    public static final int MEMORIA = 2;
    
    public static RepositorioGenerico fabricarRepositorio(int tipoNegocio, int tipoPersistencia) {
        if (tipoPersistencia == BANCODADOS) {
            switch (tipoNegocio) {
                case 1:
                    return new RepositorioAlunoBD();                
                default:
                    break;
            }
        }else if (tipoPersistencia == MEMORIA) {
            switch (tipoNegocio) {
                case 1:
                    return new RepositorioAlunoImpl();               
                default:
                    break;
            }
        }
        return null;
     }
}
