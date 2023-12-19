import java.util.ArrayList;
import java.util.LinkedList;

public class HashMap<K, V> {

    static class HashNode<K, V> {
        K key;
        V value;

        public HashNode(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private int size; // Number of key-value pairs
    private LinkedList<HashNode<K, V>>[] buckets; // Array of linked lists

    @SuppressWarnings("unchecked")
    public HashMap() {
        this.size = 0;
        this.buckets = new LinkedList[4];
        for (int i = 0; i < 4; i++) {
            this.buckets[i] = new LinkedList<>();
        }
    }

    // Implement the put method to add a key-value pair to the HashMap
    public void put(K key, V value) {
        // Add your implementation here
    }

    // Implement the containsKey method to check if the key is in the HashMap
    public boolean containsKey(K key) {
        // Add your implementation here
        return false;
    }

    // Implement the get method to retrieve the value associated with a key
    public V get(K key) {
        // Add your implementation here
        return null;
    }

    // Implement the keySet method to get a list of all keys in the HashMap
    public ArrayList<K> keySet() {
        // Add your implementation here
        return null;
    }

    public static void main(String[] args) {
        // You can test your HashMap here
    }
}
