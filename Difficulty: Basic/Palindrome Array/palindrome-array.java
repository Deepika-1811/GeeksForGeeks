
class Solution {
    public static boolean isPerfect(int[] arr) {
        // code here
        // boolean flag = false;
        // int start = 0;
        // int end = arr.length-1;
        // while(start<end){
        //     if(arr[start]==arr[end]){
        //         flag = true;
        //     }
        // start++;
        // end--;
        // }
        // return flag;
        boolean flag = true;
        int[] arr1 = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            arr1[i] = arr[arr.length-1-i];
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i] != arr1[i]){
                flag=false;
            }
        }
        return flag;
    }
}
