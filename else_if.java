import java.util.*;
public class else_if {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int age = in.nextInt();

        if(age >= 18){
            System.out.println("adult");
        }
        else if (age >=13 && age <18){
            System.out.println("teenager");

        }
        else{
            System.out.println("child");
        }
    }
    
}
