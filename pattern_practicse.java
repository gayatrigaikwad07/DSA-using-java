public class pattern_practicse {
    /*public static void main(String[] args) {
        int n = 5 ;
        for(int i =1; i<=5; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 5 ;
        for(int i=n; i>=1; --i){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        public static void main(String[] args) {
            int n = 5 ;
            for(int i=0; i<=n-1; i++){
                for(int j=0; j<= i; j++){
                    System.out.print("*" +  " ");
                }
                System.out.println("");
            }
            for(int i = n-1; i>=0; i--){
                for(int j= 0; j<= i-1; j++){
                    System.out.print("*" +  " ");

                }
                System.out.println();

            }
            public static void printStar(int n) {
                int i,j;
                for(i=0; i<n ; i++){
                    for( j = 2*(n-1); j>=0; j--){
                        System.out.print("");

                    }
                    for(j=0; j<=i; j++){
                        System.out.print("*");
                    }
                    System.out.println();

                }
                
            }
            public static void main(String[] args) {
                int n=5;
                 printStar(5);

            }

        }
    public static void main(String[] args) {
        int n =5;
        for(int i=n; i>=1; i--){
            for(int j = n; j>i; j--){
                System.out.print("");
            }
            for(int k=1; k<=i; k++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        int n =5;
        for(int i =1; i<=n; i++){
            for(int j=i;j<n; j++){
                System.out.print("");
            }
            for(int k=1; k<=i; k++){
                System.out.print("*");
            }
            System.out.println("");
        }
        for(int i =n; i>=1; i--){
            for(int j=i;j<=n; j++){
                System.out.print("");
            }
            for(int k=1; k<i; k++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static void printTriangle(int n) {
        for(int i=0; i<n; i++){
            for(int j =n-i; j>1; j--){
                System.out.print("");
            }
            for(int j =0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        
    }
    public static void main(String[] args) {
        int n =5 ;
        printTriangle(5);

    }
    public static void main(String[] args) {
        int n,i,j,blank =1;
        int m ;
        blank = m -1;
        for(j = 1; j<= n ; j++){
            for(i =1; i<=blank; i++ ){
                System.out.print("");
            }
            blank++;
            for(i =1; i<=2*j-1; i++){
                System.out.print("*");
            }
            System.out.println("");
        }
        blank = 1;
        for(j=1; j<=n-1; j++){
            for(i =1; i<=blank; i++){
                System.out.print("");
            }
            blank++;
            for(i =1; i<=2*(n-j)-1; i++){
                System.out.println("");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        int i,j,n =6;
        for(i=0; i<n; i++){
            for(j=n-i; j>1; j--){
                System.out.print(" ");
            }
            for(j=0; j<=i; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int i,j,space = 1;
        int row = 8;
        space = row -1;

        for(j =1; j<=row ; j++){
            for(i=1; i<= space; i++){
                System.out.print(" ");
            }
            space --;
            for(i =1; i<=2*j-1; i++){
                System.out.print("*");
            }
            System.out.println("");
        }
        space = 1;
        for(j=1; j<=row-1; j++){
            for(i=1; i<=space; i++){
                System.out.print(" ");
            }
            space++;
            for(i=1; i<=2*(row -j)-1; i++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        int i,j,rows;
        rows = 8;
        for(i=0; i<=rows-1; i++){
            for(j=0; j<=i; j++){
                System.out.print("*"+" " );
            }
            System.out.println("");
        }
        for(i=rows-1; i>=0; i--){
            for(j=0; j<=i-1; j++){
                System.out.print("*" + " ");
            }
            System.out.println("");
        }
        
    }
    public static void main(String[] args) {
        int i,j,k,n;
        n = 8;

        for(i=0; i<=n-1; i++){
            for(j=0; j<i; j++){
                System.out.print(" ");
            }
            for(k=i; k<=n-1; k++){
                System.out.print("*" + " ");
            }
            System.out.println(" ");
        }
        for(i = n-1; i>=0; i--){
            for(j=0; j<i; j++){
                System.out.print(" ");
            }
            for(k=i; k<=n-1; k++){
                System.out.print("*" + " ");
            }
            System.out.println("");
        }
    }*/
    public static void main(String[] args) {
        int rows = 15;
        for( int i=1; i<= rows; i++){
            for(int j=rows; j>i; j--){
                System.out.print(" ");
            }
            System.out.print("*");
            for(int k=1; k<2*(i-1); k++){
                System.out.print(" ");
            }
            if(i==1){
                System.out.print("");
            }
            else{
                System.out.println("*");
            }

        }
        for(int i=rows-1; i>=1; i--){
            for(int j=rows; j>i; j--){
                System.out.print(" ");
            }
            System.out.print("*");
            for(int k=1; k<2*(i-1); k++){
                System.out.print(" ");
            }
            if(i==1)
            System.out.println("");
            else
            System.out.println("*");
        }
    }
}


    

