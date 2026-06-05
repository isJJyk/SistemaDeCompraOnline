package SistemaDeCompra;
import EnumV.EnumPagamento;
import MainCompras.ClassCompras;

import javax.xml.transform.Source;
import java.util.Scanner;

public class MainComprasV {
    static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("COMPRAS VERTELO");

        System.out.println("Digite seu nome:");
     String nomeCLI=sc.nextLine();

        System.out.println("Digite seu CPF:");
      String cpfCLI=sc.nextLine();

        System.out.println("Digite seu endereço:");
       String endCLI=sc.nextLine();

        System.out.println("Escolha sua forma de pagamento:");
        System.out.println("1 -CARTAO");
        System.out.println("2 - PIX");
        System.out.println("3 - BOLETO");
        System.out.print("Opção: ");
        int opcao = sc.nextInt();

        EnumPagamento pagamentoCLI;
        if (opcao == 1) {
            pagamentoCLI = EnumPagamento.CARTAO;
        } else if (opcao == 2) {
            pagamentoCLI = EnumPagamento.PIX;
        } else {
            pagamentoCLI = EnumPagamento.BOLETO;
        }

        ClassCompras compra = new ClassCompras(nomeCLI, cpfCLI, endCLI, pagamentoCLI);

        String proximo;
        do {
            System.out.print("Qual o valor do produto? R$ ");
            double valor = sc.nextDouble();

            System.out.print("Qual a quantidade de produtos? ");
            int quantidade = sc.nextInt();

            compra.valorTotal(valor, quantidade);

            System.out.print("Deseja adicionar mais algum produto? (sim/nao): ");
            proximo = sc.next();

        } while (proximo.equalsIgnoreCase("sim"));

        compra.calcularfrete();

        System.out.println("cartao aprovado?(sim/nao)");
       String Statuscartao=sc.nextLine();
       compra.cartao(Statuscartao);



    }}

