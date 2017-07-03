
package Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;
//Anotação p/ trabalhar com hibernate
@Entity
@Table (name = "tb aluno") //nome da tabela no BD
public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    //Gerar os codigos automaticamente NA tabela aluno do bd
   
    @Column(name = "matrícula",nullable = false)
    private int matrícula;
    
    @Column(name = "nome",length = 30,nullable = false)
    @Length(min = 3,max = 30,message = "o tamanho deve ser entre 3 e 30")
    private String nome;
      
    @Column(name = "email",length = 30,nullable = false)
    private String email;
    
    @Column(name = "senha",length = 30,nullable = false)
    @NotNull(message = "Campo obrigatório")
    private String senha;
    
    public Aluno(){
    }
    
    public Aluno (int matrícula,String nome,String email,String senha){
        this.matrícula = matrícula;
        this.email = email;
        this.nome = nome;
        this.senha = senha;       
    }

    public Aluno(String nome, String email, int matricula, String senha) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getMatrícula() {
        return matrícula;
    }

    public void setMatrícula(int matrícula) {
        this.matrícula = matrícula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }    
}
