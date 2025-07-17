package javaDevRoadmap.core.ClassAndObject.excercise;

public class ProdutoTeste {

    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.nome = "Iphone X";
        produto.preco = 3000;
        produto.quantidade = 5;

        produto.mostrarInformacoes();

        produto.adicionarEstoque(3);

        produto.mostrarInformacoes();

        produto.removerEstoque(2);

        produto.mostrarInformacoes();
    }
}
