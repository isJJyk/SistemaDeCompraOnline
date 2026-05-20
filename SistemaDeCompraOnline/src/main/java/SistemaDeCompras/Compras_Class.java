package SistemaDeCompras;

import java.util.Scanner;

public class Compras_Class {
    String nome;
    String CPF;
    String endereco;
    String pagamento;

    double valorTotal=0;
    double frete=0;

    Scanner sc= new Scanner(System.in);

    public void addProduto(){
        String proximo;

        do {


            System.out.println("Qual valor do produto?");
            double valorProduto = sc.nextDouble();

            System.out.println("Qual a quantidades de produtos?");
            int quantidadeProdutos = sc.nextInt();

            valorTotal = valorTotal + (valorProduto * quantidadeProdutos);

            System.out.println("deseja adicionar mais algum produto?(sim/nao)");
           proximo=sc.next();
        } while (proximo.equalsIgnoreCase("sim"));


    } public void dadosCliente(){

        System.out.println("Digite seu nome:");
        nome=sc.next();

        System.out.println("Digite seu CPF:");
        CPF=sc.next();

        System.out.println("Digite seu endereço:");
        endereco= sc.next();

        System.out.println("Digite a forma de pagamento:  ");
        pagamento=sc.next();


    } public void CacularFrete(){
        if (valorTotal>500){
            System.out.println("frete gratis adicionado!");
            System.out.println("o valor total com o frete gratis é de:"+valorTotal);
        } else {
            frete=25;
            valorTotal=valorTotal+frete;
            System.out.println("sua compra nao possui frete gratis");
            System.out.println("o valor total sem o frete gratis é de:"+(valorTotal));
        }

    }public void cartao(){
        System.out.println("cartao aprovado?(sim/nao)");
        String aprovado= sc.next();

        if (aprovado.equalsIgnoreCase("sim")){
            int numero_do_pedido;

            numero_do_pedido= (int) (Math.random()*1000);
            System.out.println("numero do pedido "+numero_do_pedido);

            System.out.println("PEDIDO CONCLUIDO");


        }else {
            System.out.println("cartao recusado");
        }

    }
}
