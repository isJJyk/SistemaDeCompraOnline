package MainCompras;

import EnumV.EnumPagamento;

import java.util.Scanner;

public class ClassCompras {
    private String nome;
    private String CPF;
    private String endereco;
    private EnumPagamento pagamento;
    private double valorTotal;
    private double frete;

    public ClassCompras(String nome, String CPF, String endereco, EnumPagamento pagamento) {
        this.nome = nome;
        this.CPF = CPF;
        this.endereco = endereco;
        this.pagamento = pagamento;
        this.valorTotal = 0;
        this.frete = 0;
    }

    public void valorTotal(double valorProduto, double quantidadeproduto) {
        this.valorTotal = (valorProduto * quantidadeproduto);

    }

    public void calcularfrete() {
        if (this.valorTotal >= 500) {
            System.out.println("frete gratis adicionado");
            System.out.println("o valor final com frete gratis é de: " + this.valorTotal);
        } else {
            this.frete = 25;
            this.valorTotal += this.frete;
            System.out.println("sua compra nao possui frete gratis");
            System.out.println("o valor final");
        }
    }

    public void cartao(String aprovado) {
        if (this.pagamento == EnumPagamento.CARTAO) {
            if (aprovado.equalsIgnoreCase("sim")) {
                int numeroDoPedido = (int) (Math.random() * 1000);
                System.out.println("Número do pedido: #" + numeroDoPedido);
                System.out.println("--- PEDIDO CONCLUÍDO COM SUCESSO ---");
            } else {
                System.out.println("SEU PEDIDO NAO FOI APROVADO MLK");
            }

        } else {
            int numeroDoPedido = (int) (Math.random() * 1000);
            System.out.println("Código para pagamento emitido! Número do pedido: #" + numeroDoPedido);
            System.out.println("--- AGUARDANDO PAGAMENTO COMPLEMENTAR ---");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public EnumPagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(EnumPagamento pagamento) {
        this.pagamento = pagamento;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public double getFrete() {
        return frete;
    }
}