package pessoa;

import java.time.LocalDate;

public class Gerente extends Funcionario {
    private LocalDate dataIngresso;
    //private Agencia agencia;
    private boolean temCursoBasico;
    private static double comissao;

    public Gerente() {
        super();
    }

    public Gerente(String carteiraTrabalho, String rg, Sexo sexo, String cargo, double salario, int anoIngresso, LocalDate dataIngresso, boolean temCursoBasico) {
        super(carteiraTrabalho, rg, sexo, cargo, salario, anoIngresso);
        this.dataIngresso = dataIngresso;
        this.temCursoBasico = temCursoBasico;
    }

    @Override
    public double calcularSalario() {
        double salario = super.getSalario();
        return salario + salario * comissao;
    }
}
