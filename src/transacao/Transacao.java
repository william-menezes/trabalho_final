package transacao;

import agencia.ClienteConta;

import java.time.LocalDate;

public class Transacao {
    protected LocalDate dataTransacao;
    protected double valorTransacao;
    protected TipoTransacao tipoTransacao;
    protected CanalTransacao canalTransacao;
    protected ClienteConta clienteConta;
    protected boolean status;
    protected String senha;

    public Transacao(LocalDate dataTransacao, ClienteConta clienteConta) {
        this.dataTransacao = dataTransacao;
        this.clienteConta = clienteConta;
    }

    public LocalDate getDataTransacao() {
        return dataTransacao;
    }

    public void setDataTransacao(LocalDate dataTransacao) {
        this.dataTransacao = dataTransacao;
    }

    public double getValorTransacao() {
        return valorTransacao;
    }

    public void setValorTransacao(double valorTransacao) {
        this.valorTransacao = valorTransacao;
    }

    public TipoTransacao getTipoTransacao() {
        return tipoTransacao;
    }

    public void setTipoTransacao(TipoTransacao tipoTransacao) {
        this.tipoTransacao = tipoTransacao;
    }

    public CanalTransacao getCanalTransacao() {
        return canalTransacao;
    }

    public void setCanalTransacao(CanalTransacao canalTransacao) {
        this.canalTransacao = canalTransacao;
    }

    public ClienteConta getClienteConta() {
        return clienteConta;
    }

    public void setClienteConta(ClienteConta clienteConta) {
        this.clienteConta = clienteConta;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
