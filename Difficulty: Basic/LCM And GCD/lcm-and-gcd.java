class Solution {
    public static int[] lcmAndGcd(int a, int b) {
        // code here
        int[] lg = new int[2];
        lg[1] = gcd(a,b);
        lg[0] = (a*b)/gcd(a,b);
        
        
        return lg;
    }
    static int gcd(int a,int b){
        while(b!=0){
            int rem = a%b;
            a=b;
            b= rem;
        }
        return a;
        }
}