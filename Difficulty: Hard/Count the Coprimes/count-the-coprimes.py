class Solution:
    def cntCoprime(self, arr):
        M = max(arr)
        ctr = [0] * (M + 1)
        for x in arr:
            ctr[x] += 1

        mctr = [0] * (M + 1)
        for i in range(1, M + 1):
            for j in range(i, M + 1, i):
                mctr[i] += ctr[j]

        dp = [0] * (M + 1)
        for i in range(M, 0, -1):
            dp[i] = mctr[i] * (mctr[i] - 1) // 2
            for j in range(2 * i, M + 1, i):
                dp[i] -= dp[j]

        return dp[1]
