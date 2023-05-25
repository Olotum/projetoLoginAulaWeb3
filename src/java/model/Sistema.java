package model;

import java.sql.SQLException;

public class Sistema {
    private int idSistema;
    private String nome;
    private String nascimento;
    private String cpf;
    private String ra;
    
    private String senha;

    public Sistema(int id, String nome, String nascimento, String cpf, String ra) {
        this.idSistema = id;
        this.nome = nome;
        this.nascimento = nascimento;
        this.cpf = cpf;
        this.ra= ra;
      
    }
    
    public Sistema(String nome, String nascimento, String cpf, String ra, String senha) {
        this.nome = nome;
        this.nascimento = nascimento;
        this.cpf = cpf;
        this.ra = ra;
        this.senha = senha;
    }
    
    public Sistema(){}

    //Getter e Setter
    public String getSenha() {
        return senha;
    }
    
    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public int getIdSistema() {
        return idSistema;
    }

    public void setIdSistema(int idSistema) {
        this.idSistema = idSistema;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

   
   
    
    public boolean isLogged() throws ClassNotFoundException, SQLException {
        SistemaDAO tdao = new SistemaDAO();
        Sistema tBanco = tdao.listByName(this.nome);
        
        if(tBanco.getNome() != null){
            //Nesse bloco, o usuário foi encontrado, então a senha
            //será testada
            return (tBanco.getSenha().equals(this.senha));
        } else {
            //Neste bloco, o nome de usuário não foi encontrado
            return false;
        }
    }
        
}
