// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class SequencedArray {
    
    static int isSequencedArray(int[] a, int m, int n){
        
        for(int i = 0; i < a.length; i++){
            if(a[i] < m || a[i] > n){
                return 0;
            }
        }
        
      
        for(int i = m; i <= n; i++){
            boolean found = false;
            for(int j = 0; j < a.length - 1; j++){
                if(a[j] > a[j+1]){
                    return 0;
                }
                
             if(a[j] == i || a[j+1] == i){
                 found = true;
                 break;
             }
            }
         if(!found) return 0;
        }
        
        
    return 1;
   }
    
    public static void main(String[] args) {
        System.out.println(isSequencedArray(new int []{1, 2, 3, 4, 5}, 1, 5));
        System.out.println(isSequencedArray(new int []{-5, -5, -4, -4, -4, -3, -3, -2, -2, -2},-5, -2));
        System.out.println(isSequencedArray(new int []{-5, -5, -4, -4, -4, -2, -2, -2},-5, -2));
      
      
    }
}