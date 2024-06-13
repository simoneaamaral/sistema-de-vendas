import java.util.ArrayList;
import java.util.List;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class CarrinhoDeCompras {
    private List<Produto> itens;

    public CarrinhoDeCompras() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(Produto produto) {
        this.itens.add(produto);
    }

    public void removerItem(Produto produto) {
        for (Produto iten : itens) {
            if (iten.getNome().equals(produto.getNome()) && iten.getQuantidade() == produto.getQuantidade()) {
                this.itens.remove(iten);
            }
            else {
                System.out.println("Não foi possível remover o produto. Conferir nome e quantidade.");
            }
        }

    }

    public void listarItens() {
        for (Produto produto : itens) {
            System.out.println(produto.exibirDetalhes());
        }
    }

    public List<Produto> exportarListaProdutos() {
        return new ArrayList<>(itens);
    }

    public double calcularTotal(){
        double total = 0;
        for (Produto produto : itens) {
            total+=produto.getPreco() * produto.getQuantidade();
        }
        return total;
    }

    public void gerarArquivoTexto(String nomeArquivo) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(nomeArquivo))) {
            bw.write("Item:\t\tNome:\t\tPreço:\t\tQuantidade:\t\tSubTotal:\n");
            int i = 1;
            for (Produto item : itens) {
                bw.write(i + "\t\t"+ item.getNome() + "\t\t" + item.getPreco() + "\t\t" + item.getQuantidade() + "\t\t" +
                        (item.getPreco() * item.getQuantidade()) + "\n");
                i++;
            }
            bw.write("\nTotal: R$" + String.format("%.2f",calcularTotal()));
        } catch (IOException e) {
            System.out.println("Erro ao gerar arquivo: " + e.getMessage());
        }
    }

}


