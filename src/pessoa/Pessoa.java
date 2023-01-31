package pessoa;

import endereco.Endereco;

import java.time.LocalDate;

public abstract class Pessoa {

    protected String cpf;
    protected String nome;
    protected LocalDate dataNascimento;
    protected EstatoCivil estatoCivil;
    protected Endereco endereco;

    public Pessoa() {
    }

    public Pessoa(String cpf, String nome, LocalDate dataNascimento, EstatoCivil estatoCivil, Endereco endereco) {
        this.cpf = cpf;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.estatoCivil = estatoCivil;
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public EstatoCivil getEstatoCivil() {
        return estatoCivil;
    }

    public void setEstatoCivil(EstatoCivil estatoCivil) {
        this.estatoCivil = estatoCivil;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

//    private static String cpf;
//    private static String nome;
//    private static LocalDate dataNascimento;
//    private static EstatoCivil estatoCivil;
//    private static Endereco endereco;
//
//    public Pessoa() {
//    }
//
//
//
//    public static String getCpf() {
//        return cpf;
//    }
//
//    public static void setCpf(String cpf) {
//        Pessoa.cpf = cpf;
//    }
//
//    public static String getNome() {
//        return nome;
//    }
//
//    public static void setNome(String nome) {
//        Pessoa.nome = nome;
//    }
//
//    public static LocalDate getDataNascimento() {
//        return dataNascimento;
//    }
//
//    public static void setDataNascimento(LocalDate dataNascimento) {
//        Pessoa.dataNascimento = dataNascimento;
//    }
//
//    public static EstatoCivil getEstatoCivil() {
//        return estatoCivil;
//    }
//
//    public static void setEstatoCivil(EstatoCivil estatoCivil) {
//        Pessoa.estatoCivil = estatoCivil;
//    }
//
//    public static Endereco getEndereco() {
//        return endereco;
//    }
//
//    public static void setEndereco(Endereco endereco) {
//        Pessoa.endereco = endereco;
//    }
}
