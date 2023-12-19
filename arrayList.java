import java.util.*;
public class arrayList {
    public static void main(String[] args) {
        //String | Boolean | Float
        //classroom objectName = new ClassNAme();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();
        //java collection framework - using vector

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        list.add(1,9);
        System.out.println(list);

        /*//Get operation
        int element = list.get(2);
        System.out.println(element);

        //Delete
        list.remove(2);
        System.out.println(list);*/

        //Set
        //list.set(2,10);
        //System.out.println(list);

        //Contains
        //System.out.println(list.contains(1));
        //System.out.println(list.contains(0));


    }

}
    

