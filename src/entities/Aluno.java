package entities;

public class Aluno {

    public String nomeDoAluno;
    public double nota1;
    public double nota2;
    public double nota3;


    public double somaNotas() { //função soma das notas retorna a soma total das notas
        return nota1 + nota2 + nota3;
    }

    public double pontosQueFaltam() { // retorna os pontos que faltam para alcançar a media 60
        if (somaNotas() < 60.0) {
            return 60.0 - somaNotas();
        } else {
            return 0.0;
        }
    }

    @Override
    public String toString() { //função toString
        return
                "Faltam "
                + String.format("%.2f", pontosQueFaltam())
                + " pontos para o aluno "
                + nomeDoAluno
                + " ser aprovado.";
    }
}

