package model;

public class Produto {
    private String nome;
    private float preco;
    private int qtdEstoque;

    public Produto() {
        this.nome = "";
        this.preco = 0;
        this.qtdEstoque = 0;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        if (preco >= 0) {
            this.preco = preco;
        } else {
            System.out.println("O preço não pode ser negativo.");
        }
    }
    public int getQtdEstoque() {
        return qtdEstoque;
    }
    public void setQtdEstoque(int qtdEstoque) {
        if (qtdEstoque >= 0) {
            this.qtdEstoque = qtdEstoque;
        } else {
            System.out.println("A quantidade em estoque não pode ser negativa.");
        }
    }
    public boolean verificaProdutoDisponivel() {
        return qtdEstoque > 0;
    }

    public float totalValorEstoque() {
        return preco * qtdEstoque;
    }

    public static void main(String[] args) {

        Produto produto = new Produto();

        produto.setNome("Caneta");
        produto.setPreco(10.50f);
        produto.setQtdEstoque(50);

        System.out.println("Nome do produto: " + produto.getNome());
        System.out.println("Preço do produto: R$" + produto.getPreco());
        System.out.println("Quantidade em estoque: " + produto.getQtdEstoque());
        System.out.println("O produto está disponível? " + (produto.verificaProdutoDisponivel() ? "Sim" : "Não"));
        System.out.println("Valor total em estoque: R$" + produto.totalValorEstoque());
    }
}