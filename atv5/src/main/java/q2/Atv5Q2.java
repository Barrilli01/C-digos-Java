package q2;

import java.util.Scanner;

public class Atv5Q2 {

    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Qual o nome do aluno?");
        String nome = entrada.nextLine();
        a1.setNomeAluno(nome);
        
        System.out.println("Qual a nota da atividade do aluno?");
        double notaE = entrada.nextDouble();
        a1.setNotaExercicio(notaE);
        
        System.out.println("Qual a nota da prova do aluno?");
        double notaP = entrada.nextDouble();
        a1.setNotaProva(notaP);
        
        System.out.println("Qual a nota do trabalho do aluno?");
        double notaT = entrada.nextDouble();
        a1.setNotaTrabalho(notaT);
        
        a1.calculoMedia(notaE, notaT, notaP);
        
        System.out.println("O aluno " + nome + " obteve média = " + a1.calculoMedia(notaE, notaT, notaP) + " ! ");
        
        if (a1.calculoMedia(notaE, notaT, notaP) < 7){
            System.out.println("O aluno está reprovado!");
        } else {
            System.out.println("O aluno foi aprovado!");
        }
        entrada.close();
    }
}
