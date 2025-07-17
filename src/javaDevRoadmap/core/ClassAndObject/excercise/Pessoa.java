package javaDevRoadmap.core.ClassAndObject.excercise;

//Crie uma classe chamada Pessoa com os seguintes atributos:
//nome (String)
//idade (int)
//altura (double)
//
//Crie também os seguintes métodos:
//falar(): imprime uma mensagem com o nome da pessoa
//aniversario(): aumenta a idade da pessoa em 1 ano
public class Pessoa {

    String nome;
    int idade;
    double altura;

    void falar() {
        System.out.println("Ola eu sou o(a) " + nome);
    }

    void  aniversario() {
        idade += 1;
    }
}
