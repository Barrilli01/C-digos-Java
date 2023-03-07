package treinoProva2;

public class Gerente extends Funcionario{
    private int senha;

    public Gerente(int senha, String nome, int cpf, double salario) {
        super(nome, cpf, salario);
        this.senha = senha;
    }
    
    public boolean autentica(int senha){        
        if (this.senha == senha){
            return true;
        } else {
        return false;
        }
    }
}
