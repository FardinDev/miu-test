class DecodeArray {
    
    static int decodeArray(int[] a){
        
        if(a.length < 2) return 0;
        
        int decodedVal = 0;
        
        for(int i = 0; i<a.length - 1; i++){
            
            decodedVal = (decodedVal * 10) + Math.abs(a[i] - a[i +1]);
        }
  
    return a[0] < 0 ? -decodedVal : decodedVal;
    }
    
    public static void main(String[] args) {
    System.out.println(decodeArray(new int[]{0, -3, 0, -4, 0}));
    System.out.println(decodeArray(new int[]{-1, 5, 8, 17, 15}));
    }
}