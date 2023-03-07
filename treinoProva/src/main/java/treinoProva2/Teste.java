package treinoProva2;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int senha = 123, cpf;
        String nome;
        double salario;
        System.out.println("Digite o nome");
        nome = entrada.next();
        System.out.println("Digite o cpf");
        cpf = entrada.nextInt();
        System.out.println("Digite o salário");
        salario = entrada.nextDouble();
        
        Gerente g1 = new Gerente(senha , nome , cpf , salario);
        
        do{
            System.out.println("Digite a senha");
            senha = entrada.nextInt();
        if (g1.autentica(senha)){
            System.out.println(g1.toString());
        } else {
            System.out.println("Senha inválida");
        }
        } while(g1.autentica(senha) != true);
    entrada.close();
    }
}
