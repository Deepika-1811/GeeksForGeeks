class Solution {
    long gcd(long a, long b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    long lcm(long a, long b) {
        return a * b / gcd(a, b);
    }

    int lcmTriplets(int n) {
        long ans;
        if (n <= 2) return n;
        if (n % 2 != 0) ans = (long) n * (n - 1) * (n - 2);
        else if (n % 3 != 0) ans = (long) n * (n - 1) * (n - 3);
        else ans = (long) (n - 1) * (n - 2) * (n - 3);
        return (int) ans;
    }
}

    
