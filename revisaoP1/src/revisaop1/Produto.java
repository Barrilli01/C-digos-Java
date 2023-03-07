package revisaop1;

public class Produto {

    private int codigo;
    private String nomeProduto;
    private int quantidade;
    private double valor;

    public int getCódigo() {
        return codigo;
    }

    public void setCódigo(int código) {
        this.codigo = código;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void cadastroProduto(String nomeProduto, int codigo, int quantidade, double valor) {
        this.nomeProduto = nomeProduto;
        this.codigo = codigo;
        this.quantidade = quantidade;
        this.valor = valor;
    }
    
    public void mostraProduto() {
        System.out.println(this.nomeProduto);
        System.out.println(this.codigo);
        System.out.println(this.quantidade);
        System.out.println(this.valor);
    }
    
    public void acrescimo(double aumento){
    this.valor = valor + aumento;
    }
}
