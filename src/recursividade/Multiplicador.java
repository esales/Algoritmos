package recursividade;

public class Multiplicador {
    public int multiplicar(int numeroA, int numeroB){
        int total = 0;
        
        if (numeroB > 0){
            total = numeroA + multiplicar(numeroA, numeroB-1);
        }
        
        return total;
    }
}