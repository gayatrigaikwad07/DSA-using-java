import java.util.*;
public class pass_fail {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int marks = in.nextInt();

        String reportCard = marks >= 33 ? "PASS" : " FAIL";
        System.out.println(reportCard);
    }
    
}
