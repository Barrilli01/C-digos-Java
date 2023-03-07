package revisaop1;

public class Cliente {

    private int idade;
    private String primeiroNome;
    private String sobrenome;
    private String dataNascimento;
    private String CPF;   
    
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public void cadastroCliente(String primeiroNome , String sobrenome , int idade , String dataNascimento , String CPF){
        this.primeiroNome = primeiroNome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.dataNascimento = dataNascimento;
        this.CPF = CPF;
    }
    
    public void mostraCliente(){
        System.out.println(this.primeiroNome);
        System.out.println(this.sobrenome);
        System.out.println(this.idade);
        System.out.println(this.dataNascimento);
        System.out.println(this.CPF);
    }
}
