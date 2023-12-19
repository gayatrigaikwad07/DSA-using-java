public class bit_manipulation {
    /*public static void main(String[] args) {
        System.out.println(5 & 6);
         System.out.println(5 | 6);
         System.out.println(5 ^ 6);

         //System.out.println((~0));

         // Left Shift

        System.out.println(5<<2);
        System.out.println(6>>1);

       


    }

     //Odd even

     public static void oddOrEven(int n) {
        int bitMask = 1;
        if((n & bitMask) == 0){
            System.out.println("Even number");
        }else{
            System.out.println("ODD number");
        }
        
     }
     public static void main(String[] args) {
        oddOrEven(3);
        oddOrEven(11);
        oddOrEven(4);
     }*/

     //operations
     //Get
     //Set
     //Clear
     /*public static int getIthBit(int n , int i) {
        int bitMask = 1<<i;
        if((n & bitMask) == 0){
            return 0;
        }else{
            return 1;
        }

     }
     public static void main(String[] args) {
        System.out.println(getIthBit(0, 5));
     }
     public static int  setIthBit(int n , int i) {
        int bitMask = 1<<i;
        return n | bitMask;
        
     }
     public static void main(String[] args) {
        System.out.println(setIthBit(10, 2));
     }

     //clear
     public static int clearIthBit(int n , int i) {
        int bitMask = ~(1 <<i);
        return n & bitMask;
        
     }
     public static void main(String[] args) {
        System.out.println(clearIthBit(10,1));
     }*/


     // Update

    /*public static int updateIthBit(int n, int i, int newBit) {
        if(newBit == 0){
            return clearIthBit(n,i);
        }else{
            return setIthBit(n,i);
        }
        n = clearIthBit(n , i);
        int bitMask = newBit<<i;
        return n | bitMask ;
    }
    public static void main(String[] args) {
        System.out.println(updateIthBit(10, 2 , 1));
    }

    //Power of 2 or not

    public static boolean isPowerOfTwo(int n) {
        return (n&(n-1)) == 0;
        
    }
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(15));
    }

    // Count Set Bit

    public static int countSetBit(int n) {
        int count =0 ;
        while(n >0){
            if((n & 1) != 0){
                count++;
            }
            n=n>>1;
        }
        return count ;
        
    }
    public static void main(String[] args) {
        System.out.println(countSetBit(15));
    }*/

    // Fast Exponencial

    public static int fastExpo(int a, int n) {
        int ans = 1;

        while(n >0){
            if((n & 1) != 0){
                ans = ans*a;
            }
            a = a*a;
            n = n>>1;
        }
        return ans;
        
    }
    public static void main(String[] args) {
        System.out.println(fastExpo(3, 05));
    }
    
}
