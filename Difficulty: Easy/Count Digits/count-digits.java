class Solution {
     static int evenlyDivides(int n) {
        // code here
      int count =0;
      int s = n; // 23
      while(n>0){ //23> 0 , 2>0
          int r = n%10; // 3 ,2%10 =2
          if(r>0){ //true
          if(s%r==0){ // 23%3!=0 
              count++; // 0
          }
          }
          n/=10; // 2
      }
      return count;

    }
}