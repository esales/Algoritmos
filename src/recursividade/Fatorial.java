package recursividade;

public class Fatorial {
    public int calcularFatorial(int n){
        int fatorial = 0;
        
        if (n <= 1){
            fatorial = 1;
                    
            System.out.println(n+"!");
        } else {
            fatorial = n * calcularFatorial(n-1);
            
            System.out.println(n + " * " + (n-1) + "! = " + fatorial);
        }
        
        return fatorial;        
    }
}