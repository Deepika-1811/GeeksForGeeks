// User function Template for Java

class Solution {
    public int[] getFloorAndCeil(int x, int[] arr) {
        // code here
        int[] fc = new int[2];
        fc[0] = -1;
        fc[1] = -1; 
        int n = arr.length;
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            if(arr[i]<=x){
                fc[0] = arr[i];
            }
        }
         for(int i=n-1;i>=0;i--){
            if(arr[i]>=x){
                fc[1] = arr[i];
            }
        }
        return fc;
    }
}
