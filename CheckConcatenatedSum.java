
class CheckConcatenatedSum {
    
    static int checkConcatenatedSum(int n, int catlen){
       int initialNumber = n;
       int sum = 0;
       
       while(initialNumber > 0){
           int digit = initialNumber % 10;
           initialNumber /=10;
           
           for (int i = 1, j = 1; j <= catlen; i *= 10, j++) {
                sum += digit * i;
            }
       }
       
       if(n == sum) return 1;
       return 0;
       
   } 
    
    public static void main(String[] args) {
        System.out.println(checkConcatenatedSum(198, 2));
      
    }
}