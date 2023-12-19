public class factorial {
    public static int factorial_n(int n) {
        int f = 1;
        for(int i=1; i<=n; i++){
            f = f * i;

        }
        return f;
        
    }
    public static void main(String[] args) {
        System.out.println(factorial_n(4));
    }
    
}
