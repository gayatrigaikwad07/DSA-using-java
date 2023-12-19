import java.util.*;
public class print_subarrays {
    public static void printPairs(int numbers[] ) {
        int currSum = 0;
        int maxSum =Integer.MIN_VALUE;
        int tp = 0;
        for(int i=0; i<numbers.length; i++){
            int start = i;
            
           // int curr = numbers[i];
            for(int j=i+1; j<numbers.length; j++){
                int end = j;
                currSum = 0;
                //System.out.print("(" + curr + "," + numbers[j] + ")");
                //tp++;
                for(int k= start; k<=end; k++){
                    currSum += numbers[k];
                }
                System.out.println();
        
                if(maxSum < currSum){
                    maxSum = currSum;
                }
                 
            }
            
        
        }
           
        System.out.println(" Max Sum= : " + maxSum);
    }

    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10};
        printPairs(numbers);
      // maxSum(numbers);
    }
    
}
