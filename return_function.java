import java.util.*;
public class return_function {
    public static int calculateSum(int num1, int num2) {
        int sum = num1 +num2;
        return sum ;
        
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a= in.nextInt();
        int b= in.nextInt();
        int sum = calculateSum(a, b);
        System.out.println("Sum is : " + sum);
    }
    
}
