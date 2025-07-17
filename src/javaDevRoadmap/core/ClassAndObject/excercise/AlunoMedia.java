package javaDevRoadmap.core.ClassAndObject.excercise;

public class AlunoMedia {

    String nome;
    double nota1;
    double nota2;

    double media() {
        return nota1 + nota2 / 2;
    }

    void verificarAprovacao() {
        if(media() < 6) {
            System.out.println("Voce nao foi aprovado!!!");
        } else {
            System.out.println("Aprovado!!!!");
        }


    }


}
