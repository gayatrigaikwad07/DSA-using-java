import java.util.*;
public class function_return {
    public static void printHellowWorld(){ // Creating a function
        System.out.println("Hellow World"); // we can print no of statements by a single a function call
    }

    public static int calculateSum(int num1, int num2){ // parameter or formal parameter
        int sum = num1 + num2;
        return sum;

    }

    public static void swap(int a , int b){
        // int a = 5;
       //int b = 10 ;

       //swap
       int temp = a ;
       a = b ;
       b = temp;

       System.out.println("a ="  + a) ;
       System.out.println("b ="  + b) ;

    }
    public static void main(String[] args) {
        //printHellowWorld(); // function call
        //body
       // System.out.println("Hellow World");

      /*  Scanner sc = new Scanner(System.in);
       int a = sc.nextInt(); 
       int b = sc.nextInt();
       int sum = calculateSum(a ,b); // arguments or actul parameters.
       System.out.println("Sum is :" + sum); */

       //swap - values exchange
       int a = 5;
       int b = 10 ;
       swap(a ,b);

       //swap
       /*int temp = a ;
       a = b ;
       b = temp;*/

       System.out.println("a ="  + a) ;
       System.out.println("b ="  + b) ;
    }
    
}
