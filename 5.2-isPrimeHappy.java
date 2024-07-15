class PrimeHappy {
    static boolean isPrime(int num) {
        if (num <= 1) return false;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    static int isPrimeHappy(int n) {
        if (n <= 2) return 0;

        int sumOfPrimes = 0;
        boolean foundPrime = false;

        for (int i = 2; i < n; i++) {
            if (isPrime(i)) {
                sumOfPrimes += i;
                foundPrime = true;
            }
        }

        if (!foundPrime) return 0;

        if (sumOfPrimes % n == 0) return 1;
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(isPrimeHappy(5));  // Output should be 1
        System.out.println(isPrimeHappy(25)); // Output should be 1
        System.out.println(isPrimeHappy(12)); // Output should be 0
        System.out.println(isPrimeHappy(3));  // Output should be 0
        System.out.println(isPrimeHappy(19)); // Output should be 1
    }
}
