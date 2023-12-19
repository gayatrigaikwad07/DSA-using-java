import java.util.*;
public class Iterations_HashSet {

    public static void main(String[] args) {
        /* HashSet <String> cities = new HashSet();
        cities.add("Delhi");
        cities.add("Mubai");
        cities.add("Noida");
        cities.add("Bengaluru");

        /*Iterator it = cities.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        for(String city : cities){
           System.out.println(city);
        }*/

        // Linked Hash set
        
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Delhi");
        lhs.add("Mumbai");
        lhs.add("Noida");
        lhs.add("Bengluru");
        System.out.println(lhs);

        // Tree Set
        TreeSet<String> ts = new TreeSet<>();
        ts.add("Delhi");
        ts.add("Mumbai");
        ts.add("Noida");
        ts.add("Bengluru");
        System.out.println(ts);
    }
    
}
