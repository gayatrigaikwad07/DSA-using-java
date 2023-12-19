public class arrays {
    /*public static int  linearSearch(int numbers[] , int key) {

        for(int i =0; i<numbers.length; i++){
            if(numbers[i] == key){
                return i;
            }
        }
        return -1;
    
        
    }
    public static void main(String[] args) {
        int numbers[]= {2, 4, 6, 8,10,12,14,16};
       // String menu =
        int key = 16 ;

        int index = linearSearch(numbers, key);
        if(index == -1){
            System.out.println("Not Found");
        }else{
            System.out.println(" On the index " + index);
        }
    }
    

    //largest Number

    public static int getLargest(int numbers[]) {
        int largest =Integer.MIN_VALUE; //infinity
        int smallest =Integer.MAX_VALUE;

        for(int i=0; i<numbers.length; i++){
            if(largest < numbers[i]){
                largest = numbers [i];
            }
            if(smallest > numbers[i]){
                smallest = numbers[i];
            }

        }
        System.out.println("smallest value is " + smallest);
        return largest;

    }
    public static void main(String[] args) {
        int numbers [] = {1,2,3,4,5};
        System.out.println("GET LARGEST " + getLargest(numbers));
        
    }
    public static int  binarySearch(int numbers[],int key) {
        int start = 0, end=numbers.length-1;

        while(start <= end){
            int mid = (start + end)/2;

            if(numbers[mid] == key){
                return mid;
            }
            if(numbers[mid] == key){
                return mid;
            }
            if(numbers[mid] < key){
                start = mid +1;
            }else{
                end = mid-1;
            }
        }
        return -1;
        
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10,12,14,16};
        int key = 10;

        System.out.println(" index for key is : " + binarySearch(numbers, key));
    }
    public static void reverse(int numbers[]) {
        int first = 0 , last = numbers.length-1; 
         
        while(first < last ){
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;
            first ++;
            last --;
        }

        
    }
    public static void main(String[] args) {
        int numbers[] = {1, 2, 3, 4, 5, 6};
        reverse(numbers);
        for(int i=0; i<numbers.length; i++){
            System.out.print(numbers[i] + " ");

        }
        System.out.println();
        
    }
    public static void printPairs(int numbers[]) {
        int tp = 0;
        for(int i=0; i<numbers.length; i++){
            int curr = numbers[i];
            for(int j=i+1; j<numbers.length; j++){
                System.out.print("(" + curr + "," + numbers[j] + ")");
                tp++;
            }
            System.out.println();
        }
        System.out.print("total pairs = " +  tp);

        
    }
    public static void main(String[] args) {
        int numbers [] = {2,4,6,8,10};
        printPairs(numbers);

    }
    public static void printSubarrays(int numbers[]) {
        for(int i=0; i<numbers.length; i++){
            int start = i;
            for(int j=i; j<numbers.length; j++){
                int end = j;
                for(int k=start; k<=end; k++){
                    System.out.print(numbers[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int numbers [] = {2,4,6,8 ,10};
        printSubarrays(numbers);
    }*/

    // TRAPING WATER
    public static void main(String[] args) {
        
    }

    
}
