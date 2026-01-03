class Solution {
    public int minRemoval(int intervals[][]) {
        // code here
        int cnt =0;
        //sort intervals by start in ascending order
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0],b[0]));
        int end = intervals[0][1];
        for(int i=1;i<=intervals.length-1;i++){
            if(intervals[i][0] < end ){
                cnt = cnt+1;
                end = Math.min(end,intervals[i][1]);
            }
            else{
                end = intervals[i][1];
            }
        }
        return cnt;
    }
}
// User function Template for Java

// class Solution {
//     public static String reverseString(String s) {
//         // code here
//         String rev = "";
//         char[] arr = s.toCharArray();
//         for(int i = s.length();i>0;i--;){
//             rev = rev+arr[i];
//         }
//         return rev;
//     }
// }