// User function Template for Java

class Solution {
    // Function to find the minimum value required to balance the array.
    public int minValueToBalance(List<Integer> arr) {
        // code here
        int fs =0;
        int ss =0;
        int len = arr.size();
        for(int i=0;i<len/2;i++){
            fs +=arr.get(i);
        }
        for(int i=len/2;i<len;i++){
            ss += arr.get(i);
        }
        return (ss>fs)?ss-fs:fs-ss;
    }
}