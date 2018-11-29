package recursividade;

public class GeraA {
    
    public String gerar(int qtd){
        String retorno = "";        
      
        if (qtd >= 1){
            retorno = "A" + gerar(qtd-1);
            
            System.out.println(qtd + " -> " + retorno);
        }
        
        return retorno;
    }
}