package javaDevRoadmap.core.ClassAndObject.excercise;

public class AlunoMediaTeste {

    public static void main(String[] args) {
        AlunoMedia alunoMedia = new AlunoMedia();
        alunoMedia.nome = "Eliader";
        alunoMedia.nota1 = 10;
        alunoMedia.nota2 = 10;

        alunoMedia.media();

        alunoMedia.verificarAprovacao();
    }
}
