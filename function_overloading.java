public class function_overloading {
    /*public static int sum(int a, int b) {
        return a + b ;
        
    }
    public static int sum(int a, int b, int c) {
        return a + b + c;
        
    }
    public static void main(String[] args) {
        System.out.println(sum(3,5));
        System.out.println(sum(3,5,  1));
    }*/
    public static int sum(int a, int b) {
        return a + b;
        
    }
    public static float sum(float a, float b, float c) {
        return a + b + c;
        
    }
    public static void main(String[] args) {
        System.out.println(sum(3,5));
        System.out.println(sum(3.5f, 5.5f , 11.2f));
    }
    
}
