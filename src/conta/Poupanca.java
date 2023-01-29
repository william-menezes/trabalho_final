package conta;

import java.time.LocalDate;

public class Poupanca extends Conta {
    private double taxaRendimento;

    public Poupanca(String senha, StatusConta status, int numero, double saldo, LocalDate dataAbertura) {
        super(senha, status, numero, saldo, dataAbertura);
    }

    public Poupanca(String senha, StatusConta status, int numero, double saldo, LocalDate dataAbertura, double taxaRendimento) {
        super(senha, status, numero, saldo, dataAbertura);
        this.taxaRendimento = taxaRendimento;
    }

    @Override
    public void saque(String senha, double valor) {
        if (autenticacao(senha)) {
            System.out.println("************* SAQUE ****************");

            if (valor <= 0) {
                System.out.println("Não é possível realizar saques de valores inferiores a R$ 0.01");
            } else {
                if (valor <= saldo) {
                    saldo -= valor;
                    dataMovimentacao = LocalDate.now();
                } else {
                    System.out.println("Saldo insuficiente!");
                }
            }
        }
    }

    @Override
    public void deposito(String senha, double valor) {
        if (autenticacao(senha)) {
            System.out.println("************* DEPÓSITO ****************");
            if (valor <= 0) {
                System.out.println("Não é possível fazer depósito de valores inferiores a R$ 0.01");
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
        }
    }

    @Override
    public void efetuarPagamento(String senha, double valor) {
        if (autenticacao(senha)) {
            System.out.println("************* PAGAMENTO ****************");

            if (valor <= 0) {
                System.out.println("Não é possível realizar o pagamento de valores inferiores a R$ 0.01");
            } else {
                if (valor <= saldo) {
                    saldo -= valor;
                    dataMovimentacao = LocalDate.now();
                } else {
                    System.out.println("Saldo insuficiente!");
                }
            }
        }
    }
}
