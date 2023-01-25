package pessoa;

import endereco.Endereco;

import java.time.LocalDate;

public abstract class Pessoa {
    private static String cpf;
    private static String nome;
    private static LocalDate dataNascimento;
    private static EstatoCivil estatoCivil;

    private static Endereco endereco;

    public Pessoa() {
    }

    public static String getCpf() {
        return cpf;
    }

    public static void setCpf(String cpf) {
        Pessoa.cpf = cpf;
    }

    public static String getNome() {
        return nome;
    }

    public static void setNome(String nome) {
        Pessoa.nome = nome;
    }

    public static LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public static void setDataNascimento(LocalDate dataNascimento) {
        Pessoa.dataNascimento = dataNascimento;
    }

    public static EstatoCivil getEstatoCivil() {
        return estatoCivil;
    }

    public static void setEstatoCivil(EstatoCivil estatoCivil) {
        Pessoa.estatoCivil = estatoCivil;
    }

    public static Endereco getEndereco() {
        return endereco;
    }

    public static void setEndereco(Endereco endereco) {
        Pessoa.endereco = endereco;
    }
}
