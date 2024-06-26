public abstract class ProdutoBase implements Produto {
    private String nome;
    private double preco;
    private int quantidade;


    public ProdutoBase() {

    }
    public ProdutoBase(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public double getPreco() {
        return preco;
    }

    @Override
    public int getQuantidade() {
        return quantidade;
    }

    public abstract String exibirDetalhes();
}


