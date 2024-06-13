public class Eletronico extends ProdutoBase {
   private int garantiaMeses;

    public Eletronico(){

    }

    public Eletronico(String nome, double preco, int quantidade, int garantiaMeses) {
        super(nome, preco, quantidade);
        this.garantiaMeses = garantiaMeses;
    }

    public int getGarantiaMeses() {
        return garantiaMeses;
    }

    public void setGarantiaMeses(int garantiaMeses) {
        this.garantiaMeses = garantiaMeses;
    }

    @Override
    public String getTipo() {
        return "Eletrônico";
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
        return "\nTipo: " + getTipo()
                + "\nNome: " + getNome()
                + "\nPreço: " + String.format("R$ %.2f",getPreco())
                + "\nQuantidade: " + getQuantidade()
                + "\nGarantia Meses: " + getGarantiaMeses();
    }
}
