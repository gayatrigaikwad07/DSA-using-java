public class hallow_rectangle {
    public static void hallow(int totRows , int totCols) {
        for(int i = 1; i<=totRows; i++){
            for(int j=1; j<=totCols; j++){
                if(i==1 || i==totCols || j==1 || j ==totCols){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        hallow(5, 5);
    }
    
    
}
