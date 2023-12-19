import java.util.*;

public class Queue {
     /*static class Queues{
        static int arr[];
        static int size;
        static int rear;
        static int front;
       

        Queues(int n){
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }
        public static boolean isEmpty(){
            return rear == -1 && front == -1 ;
        }

        public static boolean isFull(){
            return (rear +1)% size == front ;
        }
        //add
        public static void add(int data) {
            if(isFull()){
                System.out.println("Queue is full");
                return ;
            }

            //add first element

            if(front == -1){
                front = 0;
            }
            rear = (rear + 1) % size ;
            arr[rear] = data ;
        }

        // remove
        public static int remove(){
            if(isEmpty()){
                System.out.println("Empty queue");
                return -1;
            }


            int result = arr[front];

            if(rear == front){
                rear = front = -1;
            }else{
                front = (front + 1)%size;
            }
            return result;
        }
        //peek
        public static int peek(){
            if(isEmpty()){
                System.out.println(" Empty Queue");
                return-1;
            }
            return arr[front];
        }
    }
    public static void main(String[] args) {
        Queues q = new Queues(5);
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.remove());
        q.add(4);
        System.out.println(q.remove());
        q.add(5);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    } 


    // Queue using LL


    static class Node{
        int data;
        Node next ;

        Node(int data){
            this.data = data;
            this.next = null;
        }

    }

    static class Queues {
        static Node head = null;
        static Node tail = null;

        public static boolean isEmpty(){
            return head == null & tail == null ;
        }

    
       

        
        //add
        public static void add(int data) {
            Node newNode = new Node(data);
            if(head == null){
                head = tail = newNode;
                return ;
            }
            tail.next = newNode ;
            tail = newNode ;
        }

          

        // remove
        public static int remove(){
            if(isEmpty()){
                System.out.println("Empty queue");
                return -1;
            }


            int front = head.data;
            // single element
            if(tail == head){
                tail = tail = null;
            }else{
                head = head.next;
            }

            return front;
        }
        //peek
        public static int peek(){
            if(isEmpty()){
                System.out.println(" Empty Queue");
                return-1;
            }
            return head.data;
        }
    }
    public static void main(String[] args) {
        Queues q = new Queues();
        q.add(1);
        q.add(2);
        q.add(3);
        

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }

    // Using JAVACOLLECTION FRAMEWORK



    public static void main(String[] args) {
        //Queue<Integer> q = new LinkedList(); //QUEUS
        Queue<Integer> q = new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);
        

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }

    // Queue USING 2 STACKS

    static class Queues {
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public static boolean isEmpty(){
            return s1.isEmpty();

        }

        //add
        public static void add(int data){
            while(!s1.isEmpty()){
                s2.push(s2.pop());
            }
            s1.push(data);
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }
         public static int remove(){
            if(isEmpty()){
                System.out.println("queue empty");
                return -1;
            }
            return s1.pop();
        }
        // peek
         public static int peek(){
            if(isEmpty()){
                System.out.println("queue empty");
                return -1;
            }
            return s1.peek();
        }

    }


    public static void main(String[] args) {
        Queues q = new Queues();
        q.add(1);
        //q.add(2);
        q.add(3);
            
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }

    // Using two Queues

    static class Stack{
        int q1 , q2;
        static Queue<Integer> q1 = new LinkedList<>();
        static Queue<Integer> q2 = new LinkedList<>();
        

        public static boolean isEmpty(){
            return q1.isEmpty() && q2.isEmpty();
        }
        public static void push(int data){
            if(!q1.isEmpty()){
                q1.add(data);
            }else{
                q2.add(data);
            }
        }
        public static int pop(){
            if(isEmpty()){
                System.out.println("Empty Stack");
                return -1;
            }
            int top = -1;

            // case1
            if(!q1.isEmpty()){
                while(!q1.isEmpty()){
                    top = q1.remove();
                    if(q1.isEmpty()){
                        break;
                    }
                    q2.add(top);
                }
            }else{
                while(!q2.isEmpty()){
                    top = q2.remove();
                    if(q2.isEmpty()){
                        break;
                    }
                    q1.add(top);
                }
            }
            return top ;
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("empty Stack");
                return -1;

            }
            int top = -1;

            // case1
            if(!q1.isEmpty()){
                while(!q1.isEmpty()){
                    top = q1.remove();
                    q2.add(top);
                }
            }else{
                while(!q2.isEmpty()){
                    top = q2.remove();
                    q1.add(top);
                }
            }
            return top ;

        }


    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }*/
   
    public static void printNonRepeating(String str){
         Queue<String> q =new LinkedList();
        
        int freq[] = new int[26];
      

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            q.add(ch);
            freq[ch - 'a']++;

            while(!q.isEmpty && freq[q.peek()-'a'] > 1){
                q.remove();
            }
            if(q.isEmpty()){
                System.out.print( -1 + " ");
            }else{
                System.out.print( q.peek() +" ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String str = "aabccxb";
        printNonRepeating(str);
    }

}








