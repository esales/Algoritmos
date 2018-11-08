package recursividade;

public class Fibonacci {
    
    public void retornarSequenciaFibonacci(int qtd){
        for (int i = 0; i < qtd; i++) {
            System.out.println(i + "-> " + fibonacci(i));
        }   
    }
    
    private int fibonacci(int n){
         if (n < 2) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
