package agencia;

import InterfaceExecao.Autenticavel;
import endereco.Endereco;
import pessoa.Gerente;

public class Agencia implements Autenticavel {
    protected int numero;
    protected String nome;
    protected Endereco endereco;
    protected Gerente gerente;
    protected String senha;

    public Agencia() {
    }


    public boolean autenticacao(String senha){
        if(senha == senhaCriaAgencia)
            return true;
        else return false;
    }

    public void cadastraAgencia(int numero, String nome, Endereco endereco, Gerente gerente, String senha){
        if(autenticacao(senha)){
            this.numero = numero;
            this.nome = nome;
            this.endereco = endereco;
            this.gerente = gerente;
            System.out.println("Agencia cadastrada com sucesso");
        }
        else System.out.println("Senha de cadastro invalida, insira a senha correta para cadastrar uma agencia");
    }


    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Gerente getGerente() {
        return gerente;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
