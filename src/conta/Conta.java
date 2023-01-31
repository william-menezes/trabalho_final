package conta;

import java.time.LocalDate;
import java.util.Objects;

public abstract class Conta {
    protected String senha;
    protected StatusConta status;
    protected int numero;
    protected double saldo;
    protected LocalDate dataAbertura;

    protected LocalDate dataMovimentacao;

    public Conta(String senha, StatusConta status, int numero, double saldo, LocalDate dataAbertura) {
        this.senha = senha;
        this.status = status;
        this.numero = numero;
        this.saldo = saldo;
        this.dataAbertura = dataAbertura;
    }

    public abstract void saque(String senha, double valor);

    public abstract void deposito(String senha, double valor);

    public abstract void consultaSaldo(String senha);

    public abstract void efetuarPagamento(String senha, double valor);


    public boolean autenticacao(String senha) {
        //return Objects.equals(this.senha, senha);

        if (Objects.equals(this.senha, senha)) {
            System.out.println("Autenticação realizada!");
            return true;
        } else {
            System.out.println("Senha incorreta!");
            return false;
        }
    }
}
