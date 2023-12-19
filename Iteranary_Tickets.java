import java.util.*;
public class Iteranary_Tickets {
    public static String getStart(HashMap<String, String> tickets) {
        HashMap<String, String> revMap = new HashMap<>();

        for(String key : tickets.keySet()){
            revMap(tickets.get(key), key);

        }
        for(String key : tickets.key()){
            if(!revMap.cointainsKey(key)){

            }
        }
        return null;
    }

    public static void main(String[] args) {
        HashMap<String, String> tickets = new HashMap<>();
        
        tickets.put("Chennai", "Bengluru");
        tickets.put("Chennai", "Bengluru");
        tickets.put("Chennai", "Bengluru");
        tickets.put("Chennai", "Bengluru");

        String start = getStart(tickets);
        System.out.print(start);
        for(String key : tickets.keySet()){
            System.out.print(" -> " + tickets.get(start));
            start = tickets.get(start);
        }
        System.out.println();
    }
    
}
