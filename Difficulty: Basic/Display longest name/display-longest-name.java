
class Solution {
    public String longest(List<String> arr) {
        // code here
        String s1 = arr.get(0);
        int len = arr.get(0).length();
        for(int i=0;i<arr.size();i++){
            if(arr.get(i).length()>len){
                s1 = arr.get(i);
                len = arr.get(i).length();
            }
        }
        return s1;
    }
}
