// User function Template for Java

class Solution {
    public static String reverseString(String s) {
        // code here
        int n = s.length();
        String rev = "";
        char[] arr = s.toCharArray();
        for(int i=n-1;i>=0;i--){
            rev = rev+arr[i];
        }
        return rev;
    }
}