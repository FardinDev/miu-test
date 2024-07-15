// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class DecodeArray {
    
    static int decodeArray(int[] a){
       
       int number = 0;
       int isNegetive = 0;
       int zeroCount = 0;
       for(int i = 0; i < a.length; i++){
           if(a[i] == -1){
              isNegetive = 1;
              continue;
           }
           
           if(a[i] == 0) zeroCount++;
           
           if(a[i] == 1){
                number = number * 10 + zeroCount;
                zeroCount = 0;
           }
           
       }
       
       
        
    return isNegetive == 1 ? -number : number;
    }
    
    public static void main(String[] args) {
         System.out.println(decodeArray(new int[]{0, 1, 1, 1, 1, 1, 0, 1}));
     System.out.println(decodeArray(new int[]{-1, 0, 1}));
     System.out.println(decodeArray(new int[]{-1, 0, 0, 1, 1, 0, 1}));
     System.out.println(decodeArray(new int[]{0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,1}));
    }
}