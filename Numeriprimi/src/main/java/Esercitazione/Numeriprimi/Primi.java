package Esercitazione.Numeriprimi;

import java.util.LinkedList;
import java.util.List;

 

public class Primi{
	
    public static boolean primo(int num) {
        int lim = num/2;
        boolean isPrimo = true;

 

        for(int div = 2; div <= lim && isPrimo; div++)
          if (num % div == 0)
            isPrimo = false;

 

        return isPrimo;
      }
    
    public static List<Integer> primeNumberGen(int n){
        List<Integer> primi= new LinkedList<>();
        if(n>=2) {
            primi.add(2);
        }
        
        for(int i=3;i<=n;i++) {
            if(primo(i))
                primi.add(i);
        }
        
        return primi;
    
    
    }
    
    

 

}
