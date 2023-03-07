package treinoprova1;

public class Seletista extends Professor {

    private double salario = 1000;
    
    public Seletista(int matricula, String nome, int idade) {
        super(matricula, nome, idade);
    }

    public double retornasalario(){
        System.out.println("Salario");
        return salario;
    }

    @Override
    public String toString() {
        return "Professor Seletista {"+ "Matrícula = " + getMatricula() + ", Nome = " + getNome() + ", Idade = " + getIdade() + ", Salario= " + salario + '}';
    }
    
}
