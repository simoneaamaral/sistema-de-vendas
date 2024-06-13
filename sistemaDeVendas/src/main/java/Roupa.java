public class Roupa extends ProdutoBase{
    private String tamanho;
    private String cor;

    public Roupa(){

    }

    public Roupa(String nome, double preco, int quantidade, String tamanho, String cor) {
        super(nome, preco, quantidade);
        this.tamanho = tamanho;
        this.cor = cor;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String getTipo() {
        return "Roupa";
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public double getPreco() {
        return super.getPreco();
    }

    @Override
    public void setNome(String nome) {

    }

    @Override
    public void setPreco(double preco) {

    }

    @Override
    public void setQuantidade(int quantidade) {

    }

    @Override
    public int getQuantidade() {
        return super.getQuantidade();
    }

    @Override
    public String exibirDetalhes() {
        return  "\nTipo: " + getTipo()
                +"\nNome: " + getNome()
                + "\nPreco: " + String.format("R$ %.2f",getPreco())
                + "\nQuantidade: " + getQuantidade()
                + "\nTamanho: " + getTamanho()
                + "\nCor: " + getCor();
    }
}
