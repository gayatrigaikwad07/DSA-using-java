public class DP {
    public static int fib(int n, int f[]){
        if(n == 0 || n == 1){
            return n;
        }
        if(f[n] != 0){
            return f[n];
        }
        f[n] = fib(n-1, f) + fib(n-2, f);
        return f[n];
    }

    public static void main(String[] args) {
        int n = 5;
        //System.out.println(fib(n));
        int f[] = new int[n+1];
        System.out.println(fib(n, f));
    }
}
