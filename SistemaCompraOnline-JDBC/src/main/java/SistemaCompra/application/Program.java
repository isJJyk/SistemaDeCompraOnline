package SistemaCompra.application;

import SistemaCompra.entities.JDBC.ClassConnection;
import SistemaCompra.entities.classes.ClassCompras;
import SistemaCompra.entities.enums.EnumPagamento;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);

        Connection conexao = ClassConnection.getConnection();

        Statement stmt = conexao.createStatement();

        System.out.println("COMPRAS VERTELO");

        System.out.println("Digite seu nome:");
        String nomeCLI = sc.nextLine();

        System.out.println("Digite seu CPF:");
        String cpfCLI = sc.nextLine();

        System.out.println("Digite seu endereço:");
        String endCLI = sc.nextLine();

        String dados_usuario = "INSERT INTO login (nome,cpf,endereco) VALUES('"+nomeCLI+"','"+cpfCLI+"','"+endCLI+"')";
        stmt.execute(dados_usuario);

        System.out.println("Escolha sua forma de pagamento:");
        System.out.println("1 -CARTAO");
        System.out.println("2 - PIX");
        System.out.println("3 - BOLETO");
        System.out.print("Opção: ");

        String pagamento = sc.nextLine().toLowerCase(Locale.ROOT);

        String dadosFormaPagamento = "INSERT INTO formapagamento (formas_escolhidas) VALUES('"+pagamento+"')";
        stmt.execute(dadosFormaPagamento);

        if (pagamento.equalsIgnoreCase("cartao")) {
            System.out.println(EnumPagamento.CARTAO);
        } else if (pagamento.equalsIgnoreCase("pix")) {
            System.out.println(EnumPagamento.PIX);
        } else if (pagamento.equalsIgnoreCase("boleto")){
            System.out.println(EnumPagamento.BOLETO);
        }else {
            System.out.println("Forma de pagamento inválida");

            System.exit(0);
        }

        ClassCompras compra = new ClassCompras(nomeCLI, cpfCLI, endCLI);

        String proximo;

        do {
            System.out.print("Qual o valor do produto? R$ ");
            double valor = sc.nextDouble();

            System.out.print("Qual a quantidade de produtos? ");
            int quantidade = sc.nextInt();

            compra.valorTotal(valor, quantidade);

            System.out.print("Deseja adicionar mais algum produto? (sim/nao): ");
            proximo = sc.next();

            String produto = "INSERT INTO produto (valor,quantidade) VALUES ('"+quantidade+"','"+quantidade+"')";
            stmt.execute(produto);

        } while (proximo.equalsIgnoreCase("sim"));

        compra.calcularfrete();

        System.out.println("cartao aprovado?(sim/nao)");
        String Statuscartao = sc.nextLine();
        compra.cartao(Statuscartao);


    }
}
