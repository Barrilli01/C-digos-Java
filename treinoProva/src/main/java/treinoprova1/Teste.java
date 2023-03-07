package treinoprova1;

public class Teste {
    public static void main(String[] args) {
        Seletista s1 = new Seletista(1 , "Francisco" , 33);
        Horista h1 = new Horista(2 , "Paulo" , 32);
        
        h1.retornaSalario(20 , 40);
                
        System.out.println(s1.toString());
        System.out.println(h1.toString());
    }
}
