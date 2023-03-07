package revisaop1;

import java.io.IOException;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) throws IOException {
        Cliente c1 = new Cliente();
        Produto p1 = new Produto();

        int op;
        Scanner entrada = new Scanner(System.in);

        do{
            
        System.out.println("--- DIGITE A OPÇÃO DESEJADA ----");
        System.out.println("--- OPÇÃO 1: CADASTRAR CLIENTE -");
        System.out.println("--- OPÇÃO 2: MOSTRAR CLIENTE ---");
        System.out.println("--- OPÇÃO 3: CADASTRAR PRODUTO -");
        System.out.println("--- OPÇÃO 4: VENDER PRODUTO ----");
        System.out.println("--- OPÇÃO 5: MOSTRAR PRODUTO ---");
        System.out.println("--- OPÇÃO 6: ACRESCENTAR VALOR -");
        System.out.println("--- OPÇÃO 7: DESCONTAR VALOR ---");
        System.out.println("--- OPÇÃO 8: SAIR --------------");
        op = entrada.nextInt();
        clearConsole();
            
        switch (op) {
            case 1:
                System.out.println("Digite o primeiro nome do cliente");
                String primeiroNome = entrada.next();

                System.out.println("Digite o segundo nome do cliente");
                String sobrenome = entrada.next();

                System.out.println("Digite a idade do cliente");
                int idade = entrada.nextInt();

                System.out.println("Digite a data de nascimento do cliente");
                String dataNascimento = entrada.next();

                System.out.println("Digite o CPF do cliente");
                String CPF = entrada.next();

                c1.cadastroCliente(primeiroNome, sobrenome, idade, dataNascimento, CPF);

                break;
                
            case 2:
                c1.mostraCliente();

                break;

            case 3:
                System.out.println("Digite o nome do produto");
                String nomeProduto = entrada.next();
                
                System.out.println("Digite o código do produto");
                int codigo = entrada.nextInt();
                
                System.out.println("Digite a quantidade do produto");
                int quantidade = entrada.nextInt();
                
                System.out.println("Digite o valor do produto");
                double valor = entrada.nextDouble();

                p1.cadastroProduto(nomeProduto, codigo, quantidade, valor);
            
                break;
                
            case 4:
                
                break;
            
            case 5:
                p1.mostraProduto();
                
                break;
                
            case 6:
                System.out.println("Digite o valor que deseja acrescentar ao produto");
                double aumento = entrada.nextDouble();
                
                p1.acrescimo(aumento);
                
                break;
                
            case 8:
                System.out.println("PROGRAMA ENCERRADO!");
                
                break;
            
            default:
                System.out.println("O NÚMERO ESCOLHIDO NÃO É VÁLIDO!");
                       
                break;
                
        }
        
        }while(op != 8);
    }

    public final static void clearConsole() {
        try {
            final String os = System.getProperty("os.name");

            if (os.contains("Windows")) {
                Runtime.getRuntime().exec("cls");
            } else {
                Runtime.getRuntime().exec("clear");
            }
        } catch (final Exception e) {
        }
    }
}
