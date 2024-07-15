// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class ZeroPlentiful {
    
    static int isZeroPlentiful(int[] a){
        if(a.length < 4) return 0;
        
        int sequenceCount = 0;
        
        int zeroCount = 0;
        for(int i = 0; i<a.length; i++){
            
            if(a[i] == 0){
                zeroCount++;
            }
            if(zeroCount == 4){
                sequenceCount++;
                zeroCount = 0;
            }
            
        }
return sequenceCount;
    }
    
    public static void main(String[] args) {
    System.out.println(isZeroPlentiful(new int[]{0, 0, 0, 0, 0}));
    System.out.println(isZeroPlentiful(new int[]{1, 2, 0, 0, 0, 0, 2, -18, 0, 0, 0, 0, 0, 12}));
    }
}