import java.util.*;
public class scientific_calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
         System.out.println("enter a :");
         int a = in.nextInt();
         System.out.println("enter b :");
        int b = in.nextInt();
         System.out.println("enter operator :");
        char operator = in.next().charAt(0);

        switch(operator){
            case '+' : System.out.println(a+b);
                          break ;
            case '-' : System.out.println(a-b);
                          break ;
             case '*' : System.out.println(a*b);
                          break ;
             case '/' : System.out.println(a/b);
                          break ;
             case '%' : System.out.println(a%b);
                              
        }
        
    }
    
}
