class Solution {
    static boolean isPrime(int n) {
        // code here
        if(n==1){
            return false;
        }
        int c = 0;
        for(int i = 2 ;i<n*1/2;i++){
            if(n%i==0){
                c++;
            }
            if(c>0){
                return false;
            }
        }
        return true;
    }
}