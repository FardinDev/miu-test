// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class LargestAdjacentSum {
    
    public static int largestAdjacentSum(int[] a){
        if(a.length < 0){
           return 0;
        }
        
        int largestSum = 0;
        for(int i = 0; i < a.length - 1; i++){
            int tempSum = a[i] + a[i+1];
            
            largestSum = tempSum > largestSum ? tempSum : largestSum;
        }
        
        return largestSum;
    }
    
    public static void main(String[] args) {
        System.out.println(largestAdjacentSum(new int[]{1,1,1,1,1,2,1,1,1}));
      
    }
}