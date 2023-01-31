package pessoa;

import endereco.Endereco;

import java.time.LocalDate;

public class Gerente extends Funcionario {
    private LocalDate dataIngresso;
    //private Agencia agencia;
    private boolean temCursoBasico;
    private static double comissao;

    public Gerente() {
        super();
    }

    public Gerente(String cpf, String nome, LocalDate dataNascimento, EstadoCivil estadoCivil, Endereco endereco, String carteiraTrabalho, String rg, Sexo sexo, String cargo, double salario, int anoIngresso, LocalDate dataIngresso, boolean temCursoBasico) {
        super(cpf, nome, dataNascimento, estadoCivil, endereco, carteiraTrabalho, rg, sexo, cargo, salario, anoIngresso);
        this.dataIngresso = dataIngresso;
        this.temCursoBasico = temCursoBasico;
    }

    @Override
    public double calcularSalario() {
        double salario = super.getSalario();
        return salario + salario * comissao;
    }

    public LocalDate getDataIngresso() {
        return dataIngresso;
    }

    public void setDataIngresso(LocalDate dataIngresso) {
        this.dataIngresso = dataIngresso;
    }

    public boolean isTemCursoBasico() {
        return temCursoBasico;
    }

    public void setTemCursoBasico(boolean temCursoBasico) {
        this.temCursoBasico = temCursoBasico;
    }

    public static double getComissao() {
        return comissao;
    }

    public static void setComissao(double comissao) {
        Gerente.comissao = comissao;
    }
}
