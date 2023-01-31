package pessoa;

public class Cliente extends Pessoa{
    private Escolaridade escolaridade;
    //private Agencia agencia;

    public Cliente (String nome, String cpf) {
        this.setNome(nome);
        this.setCpf(cpf);
    }

    public Cliente () {}



}
