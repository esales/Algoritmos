package recursividade;

public class Potencia {
    
    public double retornaPotencia(int numero, int potencia){
        double total = 1;
        
        if (potencia > 0){
            total = numero * retornaPotencia(numero, potencia-1);
        } else if (potencia < 0){
            total = 1d/numero * retornaPotencia(numero, potencia+1);
        }
        
        return total;
    }
}
