class Solution {
    
    public static int minSoldiers(int[] a, int k) {
        int n = a.length;
        int mod[] = new int[k];
        for(int troop : a) mod[(troop % k)]++;

        int mid = (n-1)/2 + 1;
        if(mod[0] >= mid) return 0;

        int cnt = mod[0], req = 0;
        for(int i=k-1; i>=0; i--) {
            if(mod[i] >= (mid - cnt)) {
                req += (mid - cnt) * (k - i);
                break;
            }

            cnt += mod[i];
            req += (mod[i] * (k - i));
        }

        return req;
    }
    
}