class Solution {
    public static boolean isPowerofTwo(int n) {
        // code here
        return Integer.bitCount(n)==1 ? true : false;
        
    }
}