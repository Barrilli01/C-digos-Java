package q2;

public class Aluno {

    private String nomeAluno; 
    private double notaExercicio; 
    private double notaTrabalho; 
    private double notaProva;

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public double getNotaExercicio() {
        return notaExercicio;
    }

    public void setNotaExercicio(double notaExercicio) {
        this.notaExercicio = notaExercicio;
    }

    public double getNotaTrabalho() {
        return notaTrabalho;
    }

    public void setNotaTrabalho(double notaTrabalho) {
        this.notaTrabalho = notaTrabalho;
    }

    public double getNotaProva() {
        return notaProva;
    }

    public void setNotaProva(double notaProva) {
        this.notaProva = notaProva;
    }

    public double calculoMedia(double notaExercicio , double notaTrabalho , double notaProva){
        double media = (notaExercicio + notaProva + notaTrabalho) / 3;
        
        return media;
    }
}
