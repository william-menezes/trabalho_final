import conta.Corrente;
import conta.StatusConta;
import conta.ValorInvalidoException;
import endereco.Endereco;
import pessoa.EstadoCivil;
import pessoa.Gerente;
import pessoa.Sexo;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {


        Gerente gerentes[] = new Gerente[10];
        gerentes[0] = new Gerente("72282256632", "Mariana Oliveira", LocalDate.parse("1990-02-03"), EstadoCivil.CASADO, new Endereco("Rua alagoas", "38408378", 12, "sem compl", "Martins", "Uberlandia", "MG"), "T123456", "MG123456", Sexo.FEMININO, "gerente geral", 4800.0, 2020, LocalDate.parse("2020-12-23"),true);
        gerentes[1] = new Gerente();
        gerentes[2] = new Gerente();
        gerentes[3] = new Gerente();
        gerentes[4] = new Gerente();
        Agencia[] agencias = new Agencia[10];
        agencias[0] = new Agencia();
        agencias[0].cadastraAgencia(001, "Getulio Vargas", new Endereco("Rua alagoas", "38408378", 12, "sem compl", "Martins", "Uberlandia", "MG"), gerentes[0], "G2222");
        agencias[1] = new Agencia();
        agencias[1].cadastraAgencia(002, "Rondon Pacheco", new Endereco("Av Rondon Pacheco", "38408378", 20, "sem compl", "Aparecida", "Uberlandia", "MG"), gerentes[1], "G2222");
        agencias[2] = new Agencia();
        agencias[2].cadastraAgencia(003, "Anselmo", new Endereco("Anselmo Alves", "38408378", 45, "sem compl", "Tibery", "Uberlandia", "MG"), gerentes[2], "G2222");
        agencias[3] = new Agencia();
        agencias[3].cadastraAgencia(004, "Joao Balbino", new Endereco("Rua Joao Balbino", "38408378", 87, "sem compl", "Santa Monica", "Uberlandia", "MG"), gerentes[3], "G2222");
        agencias[4] = new Agencia();
        agencias[4].cadastraAgencia(005, "Tubal Vilela", new Endereco("Av Duque de Caxias", "38408378", 34, "sem compl", "Centro", "Uberlandia", "MG"), gerentes[4], "G2222");


        Corrente[] contas = new Corrente[10];
        contas[0] = new Corrente("a1234", StatusConta.ATIVA, 1234, 1500, LocalDate.parse("2023-01-30"));
        contas[0].deposito("a1234", 500.0);


        try{
            contas[0].saque("a1234", 5.0);
        }catch (ValorInvalidoException e){
            System.out.println(e.getMessage());
        }finally {
            contas[0].consultaSaldo("a1234");
        }


//COLOQUEI AQUI MAS AINDA NAO SEI COMO E ONDE IREMOS USAR
//        Scanner ler = new Scanner(System.in);
//        String CPF;
//
//        System.out.printf("Informe um CPF: ");
//        CPF = ler.next();
//
//        System.out.printf("\nResultado: ");
//        // usando os metodos isCPF() e imprimeCPF() da classe "ValidaCPF"
//        if (ValidaCPF.isCPF(CPF) == true)
//            System.out.printf("%s\n", ValidaCPF.imprimeCPF(CPF));
//        else System.out.printf("Erro, CPF invalido !!!\n");
    }

}