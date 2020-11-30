package aplication;

import entities.Aluno;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US); //deixa emportugues
        Scanner sc = new Scanner(System.in);//usa a classe scanner para ler

        Aluno aluno = new Aluno();// estancia a clase aluno

        System.out.print("Nome do Aluno: "); //entrada de dados carrega as variaveis
        aluno.nomeDoAluno = sc.nextLine();
        System.out.print("Nota primeiro semestre: ");
        aluno.nota1 = sc.nextDouble();
        System.out.print("Nota segundo semestre: ");
        aluno.nota2 = sc.nextDouble();
        System.out.print("Nota terceiro semestre: ");
        aluno.nota3 = sc.nextDouble();

        System.out.printf(" Nota final do aluno : %.2f%n", aluno.somaNotas());// mostra a nota final do aluno


        if (aluno.somaNotas() < 60.0) { // se a bota final for menor que 60
            System.out.println("Aluno reprovado"); // mostra na tela aluno reprovado
            System.out.print(aluno); //chama a função toString
        }
        else{
            System.out.println("Aluno aprovado"); // se a nota for maior que 60 mostra na tela aluno aprovado
        }

        sc.close();
    }
}
