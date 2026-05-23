package SistemaDeCompras;

import java.util.Scanner;

public class Compras {
    private String nome;
    private String proximo;
    private String CPF;
    private String endereco;
    private String pagamento;
    private String aprovado;
    private double valorTotal = 0;
    private double frete = 0;
    private double valorProduto;
    private int quantidadeProdutos;

    public Compras(String nome, String CPF, String endereco, String pagamento,
                   double valorProduto, int quantidadeProdutos, String proximo, String aprovado) {
        this.nome = nome;
        this.CPF = CPF;
        this.endereco = endereco;
        this.pagamento = pagamento;
        this.quantidadeProdutos = quantidadeProdutos;
        this.valorProduto = valorProduto;
        this.proximo = proximo;
        this.aprovado = aprovado;
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

    public String getPagamento() {
        return pagamento;
    }

    public void setPagamento(String pagamento) {
        this.pagamento = pagamento;
    }

    public double getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(double valorProduto) {
        this.valorProduto = valorProduto;
    }

    public String getProximo() {
        return proximo;
    }

    public void setProximo(String proximo) {
        this.proximo = proximo;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getAprovado() {
        return aprovado;
    }

    public void setAprovado(String aprovado) {
        this.aprovado = aprovado;
    }

    public double getFrete() {
        return frete;
    }

    public void setFrete(double frete) {
        this.frete = frete;
    }

    public int getQuantidadeProdutos() {
        return quantidadeProdutos;
    }

    public void setQuantidadeProdutos(int quantidadeProdutos) {
        this.quantidadeProdutos = quantidadeProdutos;
    }

    public void addProduto() {

        do {
            valorTotal = valorTotal + (valorProduto * quantidadeProdutos);
        } while (proximo.equalsIgnoreCase("sim"));

    }

    public void CacularFrete() {
        if (valorTotal > 500) {
            System.out.println("frete gratis adicionado!");
            System.out.println("o valor total com o frete gratis é de:" + valorTotal);
        } else {
            frete = 25;
            valorTotal = valorTotal + frete;
            System.out.println("sua compra nao possui frete gratis");
            System.out.println("o valor total sem o frete gratis é de:" + (valorTotal));
        }
    }
    public void cartao() {

        if (aprovado.equalsIgnoreCase("sim")) {
            int numero_do_pedido;

            numero_do_pedido = (int) (Math.random() * 1000);
            System.out.println("numero do pedido " + numero_do_pedido);

            System.out.println("PEDIDO CONCLUIDO");


        } else {
            System.out.println("cartao recusado");
        }
    }
}