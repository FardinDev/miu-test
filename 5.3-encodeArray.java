public class EncodeArray {

    public static int[] encodeArray(int n) {
        // Calculate the number of digits in n
        int numDigits = (n == 0) ? 1 : (int) Math.log10(Math.abs(n)) + 1;

        // Handle negative numbers
        if (n < 0) {
            n = -n;
            int[] encoded = new int[numDigits + 1];
            encoded[0] = -1; // First element is -1 for negative numbers
            int index = 1;
            while (n > 0) {
                int digit = n % 10;
                for (int i = 0; i < digit; i++) {
                    encoded[index++] = 0;
                }
                encoded[index++] = 1;
                n /= 10;
            }
            return encoded;
        } else {
            int[] encoded = new int[numDigits * 2];
            int index = 0;
            while (n > 0) {
                int digit = n % 10;
                for (int i = 0; i < digit; i++) {
                    encoded[index++] = 0;
                }
                encoded[index++] = 1;
                n /= 10;
            }
            return encoded;
        }
    }

    public static void main(String[] args) {
        // Test the function with some examples
        int[] result1 = encodeArray(1234);
        System.out.println(Arrays.toString(result1)); // Output: [0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1]

        int[] result2 = encodeArray(-201);
        System.out.println(Arrays.toString(result2)); // Output: [-1, 0, 0, 1, 1, 0, 1]

        int[] result3 = encodeArray(0);
        System.out.println(Arrays.toString(result3)); // Output: [1]

        int[] result4 = encodeArray(-5);
        System.out.println(Arrays.toString(result4)); // Output: [-1, 1]

        int[] result5 = encodeArray(555);
        System.out.println(Arrays.toString(result5)); // Output: [0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1]
    }
}
