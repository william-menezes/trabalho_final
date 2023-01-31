package pessoa;

import endereco.Endereco;

import java.time.LocalDate;

public class Funcionario extends Pessoa {
    private String carteiraTrabalho;
    private String rg;
    private Sexo sexo;
    private String cargo; //criar uma classe Cargo?
    private double salario;
    private int anoIngresso;

    public Funcionario(String cpf, String nome, LocalDate dataNascimento, EstadoCivil estadoCivil, Endereco endereco, String carteiraTrabalho, String rg, Sexo sexo, String cargo, double salario, int anoIngresso) {
        super(cpf, nome, dataNascimento, estadoCivil, endereco);
        this.carteiraTrabalho = carteiraTrabalho;
        this.rg = rg;
        this.sexo = sexo;
        this.cargo = cargo;
        this.salario = salario;
        this.anoIngresso = anoIngresso;
    }

    public Funcionario() {
        super();
    }

    public double calcularSalario() {
        int anoAtual = LocalDate.now().getYear();

        if (anoAtual - anoIngresso >= 15) {
            return salario + salario * 0.1;
        } else {
            return salario;
        }
    }

    public String getCarteiraTrabalho() {
        return carteiraTrabalho;
    }

    public void setCarteiraTrabalho(String carteiraTrabalho) {
        this.carteiraTrabalho = carteiraTrabalho;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getAnoIngresso() {
        return anoIngresso;
    }

    public void setAnoIngresso(int anoIngresso) {
        this.anoIngresso = anoIngresso;
    }
}
