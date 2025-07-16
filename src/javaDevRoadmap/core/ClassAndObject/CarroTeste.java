package javaDevRoadmap.core.ClassAndObject;

public class CarroTeste {

    public static void main(String[] args) {

        //Objeto: É uma instância da classe.
        // Ou seja, quando você usa a classe para criar algo real na memória,
        // você tem um objeto.
        Carro meuCarro = new Carro();
        meuCarro.cor = "Vermelho";
        meuCarro.modelo = "Civic";
        meuCarro.ano = 2022;

        System.out.println(meuCarro.modelo);
        meuCarro.ligar();
    }
}
