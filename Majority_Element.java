/*import java.util.*;
public class Majority_Element {
    public static void main(String[] args) {
        int arr[] = {1, 3, 2, 5, 1, 3, 5, 1};
        HashMap <Integer, Integer> map = new HashMap<>();

        for(int i=0; i<arr.length; i++){
            if(map.cointainsKey(arr[i])){
                map.put(arr[i], map.get(arr[i]) + 1);
            }else{
                map.put(arr[i], 1);
            }
        }

        Set<Integer> keySet = map.keySet();
        for(Integer key : keySet);
        if(map.get(key) > arr.length/3);
        System.out.println(key);
    }
    import java.util.*; */

public class Majority_Element {
    public static void main(String[] args) {
        int arr[] = {1, 3, 2, 5, 1, 3, 5, 1};
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        int n = arr.length;
        for (Integer key : map.keySet()) {
            if (map.get(key) > n / 3) {
                System.out.println(key);
            }
        }
    }
}

    

