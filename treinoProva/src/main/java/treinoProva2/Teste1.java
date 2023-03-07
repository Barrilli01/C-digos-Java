package treinoProva2;

public class Teste1 {
    public static void main(String[] args) {
        int vetor[] = new int[3];
        try{
        vetor[2] = 1;
        System.out.println(vetor[2]);
        }catch(ArrayIndexOutOfBoundsException erro){
            System.out.println("Ocorreu um erro de indice de vetor");
        }
        System.out.println("O programa não apresentou erros");
        }
}
