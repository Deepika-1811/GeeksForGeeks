class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        // code Here
        ArrayList<Integer> result = new ArrayList<>();
        int min = arr[0];
        int max = arr[0];
        for(int i:arr){
            if(i<=min){
                min = i;
            }
            if(i>=max){
                max = i;
            }
        }
        result.add(min);
        result.add(max);
        return result;
    }
}
