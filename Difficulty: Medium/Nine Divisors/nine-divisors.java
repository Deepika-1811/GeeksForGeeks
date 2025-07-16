class Solution {
    public static int countNumbers(int n) {
        // code here
       
        int limit = (int)Math.sqrt(n);
        boolean[] isPrime = new boolean[limit + 1];

        // Initialize Sieve
        for (int i = 2; i <= limit; i++) isPrime[i] = true;
        for (int i = 2; i * i <= limit; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= limit; j += i)
                    isPrime[j] = false;
            }
        }

        // Store primes in an array
        int[] primes = new int[limit + 1];
        int primeCount = 0;
        for (int i = 2; i <= limit; i++) {
            if (isPrime[i]) primes[primeCount++] = i;
        }

        int count = 0;

        // Case 1: p^8
        for (int i = 0; i < primeCount; i++) {
            long power = 1;
            for (int j = 0; j < 8; j++) power *= primes[i];
            if (power <= n) count++;
            else break;
        }

        // Case 2: p^2 * q^2
        for (int i = 0; i < primeCount; i++) {
            long p2 = 1L * primes[i] * primes[i];
            if (p2 > n) break;

            for (int j = i + 1; j < primeCount; j++) {
                long q2 = 1L * primes[j] * primes[j];
                if (p2 * q2 <= n) count++;
                else break;
            }
        }

        return count;
    }


}

  
