// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class OnionArray {
    
    static int isOnionArray(int[] a){
       
       for(int j = 0; j < a.length; j++){
           int k = a.length - 1 - j;
           
           if(j != k && a[j] + a[k] > 10) return 0;
       }
       
    return 1;
    }
    
    public static void main(String[] args) {
          // Test the function with some examples
        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // Should return 0
        int[] array2 = {1, 2, 3, 4, 5, 4, 3, 2, 1}; // Should return 1
        int[] array3 = {1, 2, 19, 4, 5}; // Should return 1
        int[] array4 = {-2, 5, 0, 5, 12}; // Should return 1

        System.out.println(isOnionArray(array1)); // Output: 0
        System.out.println(isOnionArray(array2)); // Output: 1
        System.out.println(isOnionArray(array3)); // Output: 1
        System.out.println(isOnionArray(array4)); // Output: 1
    }
}