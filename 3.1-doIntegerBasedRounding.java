// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class IntegerBasedrounding {
    
    static void doIntegerBasedRounding(int[] a, int n){
        
        if(n > 0){
            
            for(int i = 0; i<a.length; i++){
                int lowerMultiple = (a[i] / n) * n;
                int upperMultiple = lowerMultiple + n;
                
                if(a[i] - lowerMultiple < upperMultiple - a[i]){
                    a[i] = lowerMultiple;
                }else{
                    a[i] = upperMultiple;
                }
                
            }
        }
        
    }
    
    public static void main(String[] args) {
    System.out.println(doIntegerBasedRounding(new int[]{1,2,3,4,5}, 2));
     

    }
}