class Solution {
    public int findFloor(int[] arr, int x) {
        // code here
        int n = arr.length;
       // int floor = -1;
        for(int i=n-1;i>=0;i--){
          if(arr[i]<=x){
              return i;
          }  
        }
        return -1;
}
}
