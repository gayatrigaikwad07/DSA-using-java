import java.util.*;
public class HashSet {
    public static void main(String[] args) {
        HashSet <Integer> set = new HashSet();

        set.add(1);
        set.add(2);
        set.add(4);
        set.add(2);
        set.add(1);

        System.out.println(set);

        set.remove(2);

        if(set.cointains(2)){
            System.out.println("set cointains 2");
        }
        if(set.cointains(3)){
            System.out.println("set cointains 3");
        }
    }
    
}
