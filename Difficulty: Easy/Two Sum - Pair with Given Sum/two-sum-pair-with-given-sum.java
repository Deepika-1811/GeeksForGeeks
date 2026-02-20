class Solution {
    
    //binary search function 
    static boolean binarySearch(int[] arr,int left,int right,int target){
       
        while(left<=right){
            int mid = left+(right-left)/2;
            if(arr[mid]==target){
                return true;
            }
            else if(arr[mid]<target){
                left =mid+1;
            }
            else{
                right = mid-1;
            }
        }
        return false;
    }
    
    boolean twoSum(int arr[], int target) {
        // code here
        int n = arr.length;
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            int compl = target-arr[i];
            if(binarySearch(arr,i+1,n-1,compl)){
                return true;
            }
        }
        return false;
        
    }
}