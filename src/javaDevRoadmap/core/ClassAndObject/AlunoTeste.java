package javaDevRoadmap.core.ClassAndObject;

public class AlunoTeste {

    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.nome = "Eliader";
        aluno.matricula = 102010;
        aluno.materia = "Engenharia de Software";

        aluno.imprimirInformacoes();
    }
}
