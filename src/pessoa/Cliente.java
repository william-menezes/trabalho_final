package pessoa;

import endereco.Endereco;

import java.time.LocalDate;

public class Cliente extends Pessoa{
    private Escolaridade escolaridade;
    private int numeroAgencia;

    public Cliente(String cpf, String nome, LocalDate dataNascimento, EstadoCivil estadoCivil, Endereco endereco, Escolaridade escolaridade, int numeroAgencia) {
        super(cpf, nome, dataNascimento, estadoCivil, endereco);
        this.escolaridade = escolaridade;
        this.numeroAgencia = numeroAgencia;
    }

    public Cliente (String nome, String cpf) {
        super();
        this.setNome(nome);
        this.setCpf(cpf);
    }

    public Cliente () {}

    public Escolaridade getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(Escolaridade escolaridade) {
        this.escolaridade = escolaridade;
    }
}
