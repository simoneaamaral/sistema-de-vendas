public class Principal {
    public static void main(String[] args) {

        CarrinhoDeCompras carrinho1 = new CarrinhoDeCompras();
        CarrinhoDeCompras carrinho2 = new CarrinhoDeCompras();

        Eletronico e1 = new Eletronico("TV",1200,2,12);
        Roupa r1 = new Roupa("Blusa",89.90,2,"M","Vermelha");
        Alimento a1 = new Alimento("Arroz",35.50,6,"01/2025");

        carrinho1.adicionarItem(e1);
        carrinho1.adicionarItem(r1);
        carrinho1.adicionarItem(a1);

        Eletronico e2 = new Eletronico("Notebook", 2000, 2, 12);
        Roupa r2 = new Roupa("Calça Jeans", 99.90, 2, "38", "azul");

        carrinho2.adicionarItem(e2);
        carrinho2.adicionarItem(r2);


        System.out.println("\nITENS CARRINHO 1:");
        carrinho1.listarItens();
        System.out.println(String.format("\nTOTAL A PAGAR: R$%.2f", carrinho1.calcularTotal()));

        System.out.println("\nITENS CARRINHO 2:");
        carrinho2.listarItens();
        System.out.println(String.format("\nTOTAL A PAGAR: R$%.2f", carrinho2.calcularTotal()));

        carrinho1.gerarArquivoTexto("carrinho1.txt");
        carrinho2.gerarArquivoTexto("carrinho2.txt");


    }
}
