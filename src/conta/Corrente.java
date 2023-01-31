package conta;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Corrente extends Conta implements Autenticavel{
    private double limiteChequeEspecial;
    private double taxaAdministrativa;
    private double limiteTotal;

    public Corrente(String senha, StatusConta status, int numero, double saldo, LocalDate dataAbertura) {
        super(senha, status, numero, saldo, dataAbertura);
    }

    public Corrente(String senha, StatusConta status, int numero, double saldo, LocalDate dataAbertura, double limiteChequeEspecial, double taxaAdministrativa) {
        super(senha, status, numero, saldo, dataAbertura);
        this.limiteChequeEspecial = limiteChequeEspecial;
        this.taxaAdministrativa = taxaAdministrativa;

        this.limiteTotal = saldo + limiteChequeEspecial;
    }

    @Override
    public void saque(String senha, double valor) {

        if (autenticacao(senha)) {
            System.out.println("************* SAQUE ****************");

            if (valor <= 0) {
                throw new ValorInvalidoException("Não é possível realizar saques de valores inferiores a R$ 0.01");
                //System.out.println("Não é possível realizar saques de valores inferiores a R$ 0.01");
            } else {
                if (valor <= saldo) {
                    saldo -= valor;
                    dataMovimentacao = LocalDate.now();
                } else {
                    System.out.println("Saldo insuficiente!");
                    System.out.println("Deseja utilizar o limite especial?");
                    System.out.println("Y/N");

                    Scanner scanner = new Scanner(System.in);
                    char c;
                    c = scanner.next().charAt(0);
                    c = Character.toLowerCase(c);

                    switch (c) {
                        case 'Y':
                            usarLimiteEspecial(valor);
                            break;
                        case 'N':
                            System.out.println("Operação cancelada!");
                            break;
                    }
                }
            }
        }
    }

    @Override
    public void deposito(String senha, double valor) {
        if (autenticacao(senha)) {
            System.out.println("************* DEPÓSITO ****************");
            if (valor <= 0) {
                throw new ValorInvalidoException("Não é possível fazer depósito de valores inferiores a R$ 0.01");
                //System.out.println("Não é possível fazer depósito de valores inferiores a R$ 0.01");
            } else {
                saldo += valor;
                dataMovimentacao = LocalDate.now();
                System.out.println("Depósito realizado com sucesso!");
            }
        }
    }

    @Override
    public void consultaSaldo(String senha) {
        if (autenticacao(senha)) {
            System.out.println("************* CONSULTA DE SALDO ****************");
            System.out.printf("\nSaldo: %.2f", saldo);
            System.out.printf("\nCheque Especial: %.2f", limiteChequeEspecial);
        }
    }

    @Override
    public void efetuarPagamento(String senha, double valor) {

        if (autenticacao(senha)) {
            System.out.println("************* PAGAMENTO ****************");

            if (valor <= 0) {
                throw new ValorInvalidoException("Não é possível realizar o pagamento de valores inferiores a R$ 0.01");
                //System.out.println("Não é possível realizar o pagamento de valores inferiores a R$ 0.01");
            } else {
                if (valor <= saldo) {
                    saldo -= valor;
                    dataMovimentacao = LocalDate.now();
                    System.out.println("Pagamento realizado com sucesso!");
                } else {
                    System.out.println("Saldo insuficiente!");
                    System.out.println("Deseja utilizar o limite especial?");
                    System.out.println("Y/N");

                    Scanner scanner = new Scanner(System.in);
                    char c;
                    c = scanner.next().charAt(0);
                    c = Character.toLowerCase(c);

                    switch (c) {
                        case 'Y':
                            usarLimiteEspecial(valor);
                            break;
                        case 'N':
                            System.out.println("Operação cancelada!");
                            break;
                    }
                }
            }
        }
    }

    public void usarLimiteEspecial(double valor) {
        //Variavel para armazenar o valor que será debitado do limite do cheque especial
        double diferenca = saldo - valor;

        saldo = saldo - (valor + diferenca);
        limiteChequeEspecial += diferenca;
        dataMovimentacao = LocalDate.now();
    }
}
