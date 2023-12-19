import java.util.*;

public class stack {
    /*static class Stack{
        static ArrayList<Integer> list = new ArrayList<>();
        public static boolean isEmpty(){
            return list.size() == 0;
        }

        //push
        public static void push(int data){
            list.add(data);
        }

        //pop
        public static int pop(){
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top ;

        }

        //peek
        public static int peek(){
            return list.get(list.size()-1);
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
                

    }
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static class Stack{
        static Node head = null;

        public static boolean isEmpty(){
            return head == null;

        }

        public static void push(int data){
            Node newNode = new Node(data);

            if(isEmpty()){
                head = newNode;
                return ;
            }
            newNode.next = head;
            head = newNode;
        }

        //pop
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }
        //peak
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data;
        }
    }

    // Stsck collection Framework

     public static void main(String[] args) {
        //Stack s = new Stack();
        Stack<Integer> s = new Stack< >();
        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    
    }

    public class stack{
        public static void pushAtBottom(Stack<Integer> s, int data){
            if(s.isEmpty()){
                s.push(data);
                return;
            }

            int top =s.pop() ;
            pushAtBottom(s, data);
            s.push(top);
        }

        //reverse the string
        public static String reverseString(String str){
            Stack<Character> s = new Stack<>();
            int idx = 0;
            while(idx < str.length()){
                s.push(str.charAt(idx));
                idx++;
            }
            StringBuilder result = new StringBuilder(" ");
            while(!s.isEmpty()){
                char curr = s.pop();
                result.append(curr);
            }
            return result.toString();
        }
    
    public static void main(String[] args) {
        String str = "abc";
        String result =reverseString(str);
        System.out.println(result);
    }
    

    //reverse stack

    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        printStack(s);
        reverseStack(s);
         printStack(s);
        }

        //reverse Stack

    public static void pushAtBottom(Stack<Integer> s, int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }

       
        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }

    public static void reverseStack(Stack<Integer>s){
        if(s.isEmpty()){
            return ;
        }
        int top = s.pop();
        reverseStack(s);
        pushAtBottom(s, top);
    }

    public static void printStack(Stack<Integer>s){
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }

    }

    public static void main(String[] args) {
        Stack<Integer>s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        
        reverseStack(s);
        printStack(s);

    }


    // Stock Market

    public static void stockSpan(int stocks[], int span[]){
        Stack<Integer> s = new Stack<>();
        span[0] = 1;
        s.push(0);

        for(int i=1; i<stocks.length; i++){
            int currPrice = stocks[i];
            while(!s.isEmpty() && currPrice > stocks[s.peek()]){
                s.pop();

            }
            if(s.isEmpty()){
                span[i] = i+1;
            }else{
                int prevHigh = s.peek();
                span[i] = i - prevHigh;
            }
            s.push(i);
        }
    }

    public static void main(String args[]){
        int stocks [] =  {100 ,80 , 60 , 70, 60 , 85, 100};
        int span []= new int[stocks.length];
        stockSpan(stocks,span);

        for(int i=0; i<span.length; i++){
            System.out.println(span[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {6 ,8,0, 1 ,3};
        Stack<Integer> s = new Stack<>();
        int nextGreater[]  = new int[arr.length];
        for(int i=arr.length-1; i>=0; i--){
            // 1 while
            while(!s.isEmpty() && arr[s.peek()] <= arr[i]){
                s.pop();

            }

            // 2 if-else
            if(s.isEmpty()){
                nextGreater[i] = -1;
            }else{
                nextGreater[i] = arr[s.peek()];
            }

            // 3 push in s
            s.push(i);
        }
        for(int i =0; i<nextGreater.length; i++){
            System.out.print(nextGreater[i] + " ");
        }
        System.out.println();
    

    // check validation of paranthesis

    public static boolean isValid(String str){
        Stack<Character> s = new Stack<>();

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            if(ch == '(' || ch ==  '{' || ch == '['){//opening
                s.push(ch);
            }else{
                //closing
                if(s.isEmpty()){
                    return false;
                }
                if((s.peek() == '(' && ch ==')')
                  || (s.peek() == '{' && ch == '}')
                  || (s.peek() == '[' && ch == ']')){
                    s.pop();

                }else{
                    return false;
                }
            }
        }
        if(s.isEmpty()){
            return true;
        }else{
            return false;
        }

    }

    public static void main(String[] args) {
        String str = "() " ; // true
        System.out.println(isValid(str));
    }}


    // Find THe Number of triangles in in the Historical graphs

    public static void maxArea(int arr[])
    {

        int maxArea = 0;
        int nsr[] = new int[arr.length];
        int nsl[] = new int[arr.length];

        //Next Smaller Right
        Stack<Integer> s = new Stack<>();
        for(int i =arr.length-1; i>=0; i--){
            while(!s.isEmpty() && arr[s.peek()] <= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                // -1

                nsr[i] = arr.length;
            }else{
                //top
                nsr[i] = s.peek();
            }
            s.push(i);
        }

            // Next smaller Left
        //Current Area : width = j-i-1; = nsr[i]-nsl[i]-1
        for(int i=0; i<arr.length; i++){
            int height = arr[i];
            int width = nsr[i] - nsl[i] -1;
            int currArea = height * width;
            maxArea = Math.max(maxArea, currArea);
        }
        System.out.println("max area in histogram = : " + maxArea);


       
    }
    public static void main(String[] args) {
        int arr [] = { 7, 0 ,4,2,5,0,6,4,0,5}; // heights of histrogram
        maxArea(arr);
    }*/

    // for problem solving questions

    public static int maxWater(int[] height){
        Stack<Integer> stack = new Stack<>();
        int n = height.length;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            while ((!stack.isEmpty())&& (height[stack.peek()] < height[i])) {
                int pop_height = height[stack.peek()];
                stack.pop();
                if (stack.isEmpty())break;
                int distance = i - stack.peek() - 1;
                int min_height= Math.min(height[stack.peek()],height[i])- pop_height;ans += distance * min_height;
            }
            stack.push(i);
        }return ans;
    }
    public static void main(String[] args){
        int arr[] = { 7, 0, 4, 2, 5, 0, 6, 4, 0, 5 };
        System.out.print(maxWater(arr));
    }

}
    

    
