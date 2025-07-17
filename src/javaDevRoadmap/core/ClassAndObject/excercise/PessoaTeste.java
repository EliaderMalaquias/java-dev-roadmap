package javaDevRoadmap.core.ClassAndObject.excercise;

public class PessoaTeste {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.nome = "Eliader";
        pessoa.idade = 20;
        pessoa.altura = 1.82;

        pessoa.falar();

        System.out.println(pessoa.idade);

        pessoa.aniversario();

        System.out.println(pessoa.idade);
    }
}
