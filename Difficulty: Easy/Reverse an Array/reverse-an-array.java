class Solution {
    public void reverseArray(int arr[]) {
        // code here
        int n = arr.length-1;
        int start=0;
        int end = n;
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        
    }
}