import java.util.*;
public class multipleOfTen {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        do{
            System.out.println("Enter your number");
            int num = in.nextInt();

            if( num % 10 ==0){
                continue ;

            }
            System.out.println("Number was : " + num);
        }while(true);
    }
    
}
