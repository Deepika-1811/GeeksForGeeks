class Solution {
    public boolean isPalindrome(int n) {
        // code here
        int s =n;
        int sum =0;
        while(n>0){
            int r = n%10;
            sum = sum*10 +r;
            n=n/10;
        }
        if(sum==s){
            return true;
        }
        return false;
    }
}