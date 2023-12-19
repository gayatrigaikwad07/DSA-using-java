import java.util.*;
public class n_natutalSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0 ;

        int i =1;
        while(i <= n){
            sum += i ;
            i++ ;
            
        }
        System.out.println("Sum is :" + sum);
    }
    
}
