package pessoa;

import java.time.LocalDate;

public class Gerente extends Funcionario {
    private LocalDate dataIngresso;
    //private Agencia agencia;
    private boolean temCursoBasico;
    private static double comissao;

    @Override
    public double calcularSalario() {
        double salario = super.getSalario();
        return salario + salario * comissao;
    }
}
