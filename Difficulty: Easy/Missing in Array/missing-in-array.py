#User function Template for python3
class Solution:
    def missingNumber(self,arr):
        n = len(arr)
        s1 = 0
        for i in range(0,n):
            s1 = s1+arr[i]
        s2 =0
        for i in range(1, n+2):
            s2+=i
        return s2-s1
        
 

#{ 
 # Driver Code Starts
#Initial Template for Python 3

t = int(input())
for _ in range(0, t):
    arr = list(map(int, input().split()))
    s = Solution().missingNumber(arr)
    print(s)

    print("~")
# } Driver Code Ends