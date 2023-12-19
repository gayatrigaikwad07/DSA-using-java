import java.util.*;
public class conditional_operator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int age = in.nextInt();
        if(age >= 18){
            System.out.println("adult : drive , vote");
        }

        if(age >= 13 && age < 18){
            System.out.println("teenager");

        }
        //if(age < 13){
            //System.out.println(" not adult");

        //}
        else{
            System.out.println("adult");
            

            
        }
    }

    
}
