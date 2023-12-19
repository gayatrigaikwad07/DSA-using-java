import java.util.*;
public class checkPrime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        if(n == 2){
           System.out.println("n is prime"); 
        }

        else{
            
        boolean isPrime = true ;
        for(int i=2; i<=n-1; i++){// for big no addin 2nd term i<=Math.sqrt(n); . i t is less time consuming
            if(n % i == 0){// n is multiple of i (i not equal to 1 or n)
                isPrime = false ;
            }
        }
        if(isPrime == true){
            System.out.println(" n is prime");
        }else{
            System.out.println(" n is not Prime");

        }

        }
        
    }
    
}
