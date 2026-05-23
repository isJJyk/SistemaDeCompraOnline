package SistemaDeCompras;

import java.lang.foreign.ValueLayout;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = sc.next();

        System.out.println("Digite seu CPF:");
        String CPF = sc.next();

        System.out.println("Digite seu endereço:");
        String endereco = sc.next();

        System.out.println("Digite a forma de pagamento:  ");
        String pagamento = sc.next();

        System.out.println("Qual valor do produto?");
        double valorProduto = sc.nextDouble();

        System.out.println("Qual a quantidades de produtos?");
        int quantidadeProdutos = sc.nextInt();

        System.out.println("deseja adicionar mais algum produto?(sim/nao)");
        String proximo = sc.next();

        System.out.println("cartao aprovado?(sim/nao)");
        String aprovado = sc.next();

        Compras compras = new Compras(nome, CPF, endereco, pagamento,valorProduto, quantidadeProdutos, proximo, aprovado);

        System.out.println("Nome: "+nome);
        System.out.println("CPF: "+CPF);
        System.out.println("Endereço: "+endereco);
        System.out.println("Pagamento: "+pagamento);
        System.out.println("Valor do seu produto: "+ valorProduto);
        System.out.println("Quantidade do produto: "+quantidadeProdutos);
        System.out.println("Adicionar produto: "+proximo);
        compras.addProduto();
        System.out.println("Cartão aprovado: "+aprovado);
        compras.cartao();
        compras.CacularFrete();
    }
}