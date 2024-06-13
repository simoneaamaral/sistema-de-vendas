public class Alimento extends ProdutoBase{
    private String dataValidade;

    public Alimento(){

    }

    public Alimento(String nome, double preco, int quantidade, String dataValidade) {
        super(nome, preco, quantidade);
        this.dataValidade = dataValidade;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    @Override
    public String getTipo() {
        return "Alimento";
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
                + "\nPreco: " + String.format("R$ %.2f",getPreco())
                + "\nQuantidade: " + getQuantidade()
                + "\nData de Validade: " + getDataValidade();
    }
}
