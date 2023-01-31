import conta.Corrente;
import conta.StatusConta;
import conta.ValorInvalidoException;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Corrente cc = new Corrente("a1234", StatusConta.ATIVA, 1234, 1500, LocalDate.parse("2023-01-30"));
        cc.deposito("a1234", 500.0);

        try{
            cc.saque("a1234", -5.0);
        }catch (ValorInvalidoException e){
            System.out.println(e.getMessage());
        }finally {
            cc.consultaSaldo("a1234");
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