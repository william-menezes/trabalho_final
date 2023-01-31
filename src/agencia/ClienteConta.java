package agencia;

import conta.Conta;
import pessoa.Cliente;

public class ClienteConta {
    protected Conta conta;
    protected Cliente[] clientes = new Cliente[2];

    public ClienteConta(Conta conta, Cliente[] clientes) {
        this.conta = conta;
        this.clientes = clientes;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public Cliente[] getClientes() {
        return clientes;
    }

    public void setClientes(Cliente[] clientes) {
        this.clientes = clientes;
    }
}
