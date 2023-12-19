import java.util.*;
public class pratice {
    /*public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int income = in.nextInt();
        int tax ;
        //int tax = income ;

        if(income <= 500000){
            tax = 0;
            //System.out.println("No tax");
        }
         else if(income >= 500000 && income < 1000000){
            tax = (int) (income*0.2);
            //System.out.println("Payable Amount");
        }
        else{
            tax =(int)(income*0.3);
        }
         System.out.println("Your " + tax);

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        if((a > c)&&(a >b)){
            System.out.println("a is greater :" +  a);
        }
        else if(( b > a)&&(b>c)){
            System.out.println("b is greater :" +  b);
        }
        else{
            System.out.println("c is greater :" +  c);
        }
    }
    
    
}
     public static void main(String[] args) {
        //Scanner in = new Scanner(System.in);
       // int number = in.nextInt();
       int number = 5 ;


        // ternary operator
        String type = ((number %2)==0) ? "even":"odd";
        System.out.println(type);
     }
     
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        String type = (number>=33) ? "pass":"fail";
        System.out.println(type);
    }
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        switch(number){
            case 1: System.out.println("Samosa");
                   break;
            case 2: System.out.println("ice_cream");
                   break;
            case 3: System.out.println("Cold Drink");
                     break;
            default: System.out.println("WE are dreaming");

        }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        char operator = in.next().charAt(0);

        switch (operator) {
            case '+':System.out.println(a + b);
                break;
            case '-':System.out.println(a - b);
                break;
            case '*':System.out.println(a * b);
                break;
            case '/':System.out.println(a / b);
                break;
            default :System.out.println(a % b);
                                break;

        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        
        //String type = (num)
        String type = ((num <=0)) ? "negative":"positive";
        System.out.println(type);
    }
    public static void main(String[] args) {
        double temp = 103.5;

        if(temp <= 100){
            System.out.println("Normal - No fever");
        }
        else{
            System.out.println("Fever");

        }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in) ;
        int day =in.nextInt();

        switch (day) {
             case 1 : System.out.println("Sunday");
                      break;
             case 2 : System.out.println("Monday");
                      break;
             case 3 : System.out.println("Tues");
                      break;
             case 4 : System.out.println("Wenes");
                      break;
             case 5 : System.out.println("Thurs");
                      break;
             case 6 : System.out.println("Fri");
                      break;
             default : System.out.println("Saturday");
                      break;
        
            
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in) ;
        int number =in.nextInt();

        if((number/100==0) && (number /400==0)){
            System.out.println("It is leap year");
        }
        else{
            System.out.println("Not a leap year");
        }
    }
    public static void main(String[] args) {
        //int n = 10899 ;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        while(n>0){
            int lastDigit = n%10;
            System.out.print(lastDigit);
            n = n /10 ; // n = ((10899 % 10) ==0)
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int n = 10899 ;
        int rev = 0;
 
        while(n > 0){
            int lastDigit = n % 10;
            rev = (rev*10) + lastDigit ;
            n = n/10 ;
        }
        System.out.println(rev);
    }
    public static void main(String[] args) {
        int counter = 1;
        do{
            System.out.println("Hellow World");
            counter ++ ;
        }while(counter <=10);
    }
    public static void main(String[] args) {
        for(int i = 1; i<=5; i++){
            if(i == 3){
                break;
            }
            System.out.println(i);
        }
        System.out.println(" I am out of the loop");
    }    
}
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        do{
            System.out.print("Enter your number");
            int n = in.nextInt();
            if( n % 10 ==0 ){
                break;
            }
            System.out.println(n);
        }while(true);
    }
    public static void main(String[] args) {
        for(int i=1; i<=5; i++){
            if(i==3){
                continue ;
            }
            System.out.println(i);
            
        }
    }
       public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        do{
            System.out.print("Enter your number :");
            int n = in.nextInt();
            

        
        if(n%10==0){
            continue ;
        }
        System.out.println("The number was : " + n);
       }while(true);
    
       }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        boolean isPrime =true ;
        for(int i=2; i<=n-1; i++){
            if(n% i == 0){
                isPrime = false;
            }
        }
        if(isPrime==true){
            System.out.println("n is prime");
        }else{
            System.out.println("n is not prime");
        }

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();
        int n4 = in.nextInt();
        int sum = 0 ;

        int i =1;
        while(i <= n){
            sum += i ;
            i++ ;
        //for(int i=1; i<=n; i++){
            //System.out.println("Sum of even number");
        }
            
        //}
        System.out.println("Sum is :" + sum);
        
        public static void main(String[]args) {
            Scanner sc=new Scanner(System.in);
            int number;
            int choice;
            int evenSum=0;
            int oddSum = 0;
            do{
                System.out.print("Enter the number ");
                number=sc.nextInt();
                if(number%2==0) {
                    evenSum+=number;
                }else{
                    oddSum+=number;
                }
                System.out.print("Do you want continue ? Press 1 for yes or 0 for no");
                choice = sc.nextInt();
            }while(choice ==1);
            System.out.println("Sum of even Number:" + evenSum);
            System.out.println("Sum of odd Number:" + evenSum);
        
        }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        int option ;
        //int eS = in.nextInt();
        int evenSum = 0 ;
         //int oD = in.nextInt();
        int oddSum = 0 ;

        do{
            if(n%2 ==0){
                System.out.println("Sum is even");
            }else{
                System.out.println("Sum is Odd");
            }
            System.out.println(" which option do you want  1 is yes and 0 is no ");
            option  = in.nextInt();
        }while( option == 1 ) ;
            if(option ==1 ){
                System.out.println("Sum is even");
            }else{
                System.out.println("Sum is odd");
            }
            
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);


        int number;
        int choice ;
        int evenSum = 0;
        int oddSum = 0;

        do{
            System.out.print("Enter the number");
            number = sc.nextInt();
            if(number % 2== 0){
                evenSum += number; 
            }else{
                oddSum += number ;
            }
              System.out.println("o you want tocontinue ? Press 1 for yes or 0 for no");
              choice = sc.nextInt();
        }while(choice==1);
        System.out.println("Sum of even mumber" + evenSum);
        System.out.println("Sum of even mumber" + evenSum);
    }   
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int  num ;

        int fact = 1 ;
         num = in.nextInt();

        for(int i =1; i<=num; i++){
            fact*= i ;
        }
        System.out.println("Factorial:" + fact);
    }
    public static void  printpractice(int number) {
       Scanner sc = new  Scanner(System.in);
       System.out.print("Enter number") ;
       int n = sc.nextInt();
       for(int i=1; i<=10; i++){
        System.out.println(n + "*" + i + "=" + n*i);

       }
    }
    public static void main(String s[]) {
        printpractice(5);
        
    }
    public static void main(String[] args) {
        for(int i=1; i<=4; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
                
            }
            System.out.println();
            

        }
    }
    public static void main(String[] args) {

        int n = 4;
        for(int i=1; i<=4; i++){
            for(int j=1; j<=4-i+1; j++){
                System.out.print("*");
                
            }
            System.out.println();
            

        }
    }
    public static void main(String[] args) {

        int n = 4;
        for(int i=1; i<=4; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
                
                
            }
            System.out.println();
        
            

        }
    }
    public static void main(String[] args) {
         //int n = 4;
         char aman = 'A';
         int count = 1;
        for(int i=1; i<=4; i++){
            for(int j=1; j<=count; j++){
                System.out.print(aman);
                aman++;
                
                
            }
            System.out.println();
            count++;
        
            

        }
    }
    public static void main(String[] args) {
        int n = 4;
        for(int i=1; i<=4; i++){
            System.out.print(" * ");
            i++;
        }
            for(int j=1; j<=5-3; j++){
                System.out.println("  *   ");
                
                
            }
            System.out.println();
        
            

        }
        public static void main(String[] args) {

        int n = 8;
        for(int i=1; i<=4-n+1; i++){
            for(int j=1; j<=4; j++){
                System.out.print("*");
                
            }
            System.out.println();
            

        }
    }
    
    public static void main(String[] args) {
        int row = 4;
        for(int i=1; i<=row; i++){
            for(int j=1; j<=row; j++){
                System.out.print(" ");
                
            }
               System.out.println();
              }
              for(int k=1; k <= i; k++){
                System.out.println();
            }
            System.out.println();
        }
        public static void main(String[] args) {
            int rowCount = 4;
    
            for (int i = 1; i <= rowCount; i++) {
                // spaces
                for (int j = 1; j <= rowCount - i; j++) {
                    System.out.print(" ");
                }
    
                
                for (int k = 1; k <= i; k++) {
                    System.out.print("*");
                }
    
                System.out.println();
            }
        }
    public static void main(String[] args) {

        int n = 5;
        for(int i=1; i<=5; i++){
            for(int j=1; j<=5-i+1; j++){
                System.out.print( j );
                
            }
            System.out.println();
            

        }
    }
    public static void main(String[] args) {
        int n = 1;
        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                System.out.print(n  + " ");
                n ++;
                
            }
            System.out.println();
            

        }
    }
    public static void main(String[] args) {
        int n = 1;
        for(int i=1; i<=5; i++){
            int value = i % 2 == 0 ? 0: 1;
            for(int j=1; j<=i; j++){
                System.out.print(value + " ");
                //String type = ((n) ? "even" : "odd";
                //System.out.println(type);

                value = value == 0 ? 1 : 0;
            }
                
                
            
            System.out.println();
            

        }
    }*/
}



    



