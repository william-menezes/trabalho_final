package conta;

import InterfaceExecao.Autenticavel;
import InterfaceExecao.ValorInvalidoException;

import java.time.LocalDate;

public class Salario extends Conta implements Autenticavel {
    private double limiteSaque;
    private double limiteTransferencia;

    public Salario(String senha, StatusConta status, int numero, double saldo, LocalDate dataAbertura) {
        super(senha, status, numero, saldo, dataAbertura);
    }

    public Salario(String senha, StatusConta status, int numero, double saldo, LocalDate dataAbertura, double limiteSaque, double limiteTransferencia) {
        super(senha, status, numero, saldo, dataAbertura);
        this.limiteSaque = limiteSaque;
        this.limiteTransferencia = limiteTransferencia;
    }

    @Override
    public void saque(String senha, double valor) {
        if (autenticacao(senha)) {
            System.out.println("************* SAQUE ****************");

            if (valor <= 0) {
                throw new ValorInvalidoException("Não é possível realizar saques de valores inferiores a R$ 0.01");
                //System.out.println("Não é possível realizar saques de valores inferiores a R$ 0.1");
            } else {
                if (valor > saldo) {
                    System.out.println("Saldo insuficiente!");
                } else {
                    if (valor >= limiteSaque) {
                        System.out.println("Não foi possível completar a transação!");
                        System.out.println("Limite de saque excedido.");
                    } else {
                        saldo -= valor;
                        dataMovimentacao = LocalDate.now();
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
                }
            }
        }
    }
}
