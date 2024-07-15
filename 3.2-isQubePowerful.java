// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class CubePowerful {
    
static int isCubePowerful(int n){
    if(n < 1){
        return 0;
    }
    int originalNumber = n;
    int sum = 0;
    
    while(n > 0){
        int digit = n%10;
        n /=10;
        sum += Math.pow(digit, 3);
        
    }
    
      if(sum == originalNumber) return 1; 
      return 0;
    }
    
    public static void main(String[] args) {
    System.out.println(isCubePowerful(153));
    System.out.println(isCubePowerful(370));
    System.out.println(isCubePowerful(87));
     

    }
}