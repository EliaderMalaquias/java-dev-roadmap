package javaDevRoadmap.core.ClassAndObject.excercise;

public class Produto {

    String nome;
    double preco;
    int quantidade;

    void mostrarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Quantidade: " + quantidade);
    }

    void adicionarEstoque(int quantidade) {
        this.quantidade += quantidade;
    }

    void removerEstoque(int quantidade) {
        this.quantidade -= quantidade;
    }
}
