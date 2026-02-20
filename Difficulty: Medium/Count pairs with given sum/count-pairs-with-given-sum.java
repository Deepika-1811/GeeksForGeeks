class Solution {
    int countPairs(int arr[], int target) {
        // code here
       HashMap<Integer,Integer> freq = new HashMap<>();
       int count =0;
       for(int i=0; i<arr.length;i++){
           int comple = target-arr[i];
           if(freq.containsKey(comple)){
               count += freq.get(comple);
           }
            freq.put(arr[i], freq.getOrDefault(arr[i], 0) + 1);
       }
       return count;
    }
}