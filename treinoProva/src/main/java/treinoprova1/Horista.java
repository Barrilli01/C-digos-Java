package treinoprova1;

public class Horista extends Professor {

    private double salario;

    public Horista(int matricula, String nome, int idade) {
        super(matricula, nome, idade);
    }
    
    public double retornaSalario(int qtHoras , int vlHoras){
        salario = vlHoras * qtHoras;
        return salario;
    }
    
    @Override
    public String toString() {
        return "Professor Horista {"+ "Matrícula = " + getMatricula() + ", Nome = " + getNome() + ", Idade = " + getIdade() + ", Salario= " + salario + '}';
    }
}
