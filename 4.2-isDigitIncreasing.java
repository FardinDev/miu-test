// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class DigitIncreasing {
    
    static int isDigitIncreasing(int n){
       
       for(int i = 1; i <= 9; i++){
           int sum = 0;
           int term = 0;
           
           for(int j = 0; sum < n; j++){
               term = (term * 10) + i;
               sum += term;
               
            if(sum == n) {
                return 1;
            }
           }
       }
        
    return 0;
    }
    
    public static void main(String[] args) {
         System.out.println(isDigitIncreasing(7));
          System.out.println(isDigitIncreasing(36));
           System.out.println(isDigitIncreasing(984));
    
    }
}