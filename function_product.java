import java.util.*;
public class function_product {
    public static int product(int a , int b) {
        int multiply = a*b;
        return multiply ;
        
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       
         int a = in.nextInt();
         int b = in.nextInt();

         System.out.println("The multiplication is : " + a*b);
         

    }
    
}
