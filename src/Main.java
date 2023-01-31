import agencia.Agencia;
import agencia.ClienteConta;
import conta.Corrente;
import conta.Poupanca;
import conta.Salario;
import conta.StatusConta;
import endereco.Endereco;
import pessoa.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        //CADASTRO DE PESSOAS
        Gerente[] gerentes = new Gerente[3];
        gerentes[0] = new Gerente("12523512525", "Mariana Oliveira", LocalDate.parse("1990-02-03"), EstadoCivil.CASADO, new Endereco("Rua Alagoas", "38408378", 12, "", "Martins", "Uberlandia", "MG"), "T123456", "MG-123.456", Sexo.FEMININO, Cargo.GERENTE, 4800.0, 2020, LocalDate.parse("2020-12-23"), true);
        gerentes[1] = new Gerente("39632546845", "Yago Martins", LocalDate.parse("1982-07-25"), EstadoCivil.SOLTEIRO, new Endereco("Rua Pedro Jose Samora", "38405044", 74, "Casa 3", "Jardim Patricia", "Uberlandia", "MG"), "T2513846", "MG-12.234.584", Sexo.MASCULINO, Cargo.GERENTE, 4700.0, 2015, LocalDate.parse("2015-10-10"), true);
        gerentes[2] = new Gerente("36523345021", "Bruno dos Santos", LocalDate.parse("1978-02-06"), EstadoCivil.CASADO, new Endereco("Rua Alagoas", "38408378", 12, "", "Martins", "Uberlandia", "MG"), "T658123", "MG-282.333", Sexo.MASCULINO, Cargo.GERENTE, 5200.0, 1999, LocalDate.parse("1999-12-22"), true);

        Funcionario[] funcionarios = new Funcionario[2];
        funcionarios[0] = new Funcionario("12345678900", "Carlos Alberto", LocalDate.parse("1987-05-12"), EstadoCivil.CASADO, new Endereco("Rua Prata", "38400000", 25, "", "Centro", "Uberlandia", "MG"), "T121232343", "M-212.333", Sexo.MASCULINO, Cargo.ATENDENTE_COMERCIAL, 3200, 2010);
        funcionarios[1] = new Funcionario("10020030055", "Fernanda Paiva", LocalDate.parse("1991-07-08"), EstadoCivil.SOLTEIRO, new Endereco("Rua Azul", "38400010", 70, "Casa 1", "Tibery", "Uberlandia", "MG"), "T20030120", "MG-1.220.354", Sexo.FEMININO, Cargo.ESPECIALISTA_INVESTIMENTOS, 4500, 2017);

        Cliente[] clientes = new Cliente[3];
        clientes[0] = new Cliente("52310225602", "Marcelo de Castro", LocalDate.parse("1973-12-01"), EstadoCivil.VIUVO, new Endereco("Rua Amarela", "38400524", 31, "", "Copacabana", "Uberlandia", "MG"), Escolaridade.MEDIO_COMPLETO, 1);
        clientes[1] = new Cliente("01585264872", "Pedro da Silva", LocalDate.parse("1989-10-10"), EstadoCivil.DIVORCIADO, new Endereco("Avenida São Paulo", "38405012", 1, "Apto 202", "Brasil", "Uberlandia", "MG"), Escolaridade.SUPERIOR_INCOMPLETO, 2);
        clientes[2] = new Cliente("11232546866", "Jaqueline de Souza", LocalDate.parse("1994-10-22"), EstadoCivil.SOLTEIRO, new Endereco("Avenida Afonso Pena", "38418088", 101, "Apto 703", "Centro", "Uberlandia", "MG"), Escolaridade.SUPERIOR_COMPLETO, 1);


        //CADASTRO DE AGENCIAS
        Agencia[] agencias = new Agencia[3];
        agencias[0] = new Agencia();
        agencias[0].cadastraAgencia(1, "Getulio Vargas", new Endereco("Rua Alagoas", "38408378", 12, "", "Martins", "Uberlandia", "MG"), gerentes[0], "G2222");
        agencias[1] = new Agencia();
        agencias[1].cadastraAgencia(2, "Rondon Pacheco", new Endereco("Avenida Rondon Pacheco", "38408378", 20, "", "Aparecida", "Uberlandia", "MG"), gerentes[1], "G2222");
        agencias[2] = new Agencia();
        agencias[2].cadastraAgencia(3, "Anselmo", new Endereco("Avenida Anselmo Alves dos Santos", "38408378", 45, "", "Tibery", "Uberlandia", "MG"), gerentes[2], "G2222");
        /*
        agencias[3] = new Agencia();
        agencias[3].cadastraAgencia(4, "Joao Balbino", new Endereco("Rua Joao Balbino", "38408378", 87, "", "Santa Monica", "Uberlandia", "MG"), gerentes[3], "G2222");
        agencias[4] = new Agencia();
        agencias[4].cadastraAgencia(5, "Tubal Vilela", new Endereco("Avenida Duque de Caxias", "38408378", 34, "", "Centro", "Uberlandia", "MG"), gerentes[4], "G2222");
        */


        //CADASTRO DE CONTAS
        Corrente[] contaCorrente = new Corrente[3];
        contaCorrente[0] = new Corrente("a1234", StatusConta.ATIVA, 1234, 1500, LocalDate.parse("2023-01-30"));
        contaCorrente[1] = new Corrente("abc123", StatusConta.ATIVA, 1010, 750, LocalDate.parse("2022-10-25"));
        contaCorrente[2] = new Corrente("142712", StatusConta.DESATIVADA, 1252, 0, LocalDate.parse("2000-01-22"));

        Salario[] contaSalario = new Salario[2];
        contaSalario[0] = new Salario("1212", StatusConta.ATIVA, 2354, 1212.89, LocalDate.parse("2023-01-01"));
        contaSalario[1] = new Salario("8956ab", StatusConta.ATIVA, 2789, 1798.37, LocalDate.parse("2021-07-12"));

        Poupanca[] contaPoupanca = new Poupanca[3];
        contaPoupanca[0] = new Poupanca("3636", StatusConta.ATIVA, 7234, 20523.42, LocalDate.parse("1982-11-03"));
        contaPoupanca[1] = new Poupanca("4259", StatusConta.ATIVA, 7785, 452.12, LocalDate.parse("1999-10-23"));
        contaPoupanca[2] = new Poupanca("3254", StatusConta.DESATIVADA, 7102, 0, LocalDate.parse("2001-07-20"));


        //CADASTRO DE CLIENTE_CONTA

        ClienteConta[] clienteConta = new ClienteConta[8];
        clienteConta[0] = new ClienteConta();
        clienteConta[1] = new ClienteConta();
        clienteConta[2] = new ClienteConta();


        //CADASTRO DE TRANSAÇÕES
        contaCorrente[0].deposito("a1234", 500.0);
        contaSalario[1].consultaSaldo("1212");

    }
}