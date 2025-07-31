class Solution:
    def powerfulInteger(self, intervals, k):
        # code here  def powerfulInteger(self, intervals, k):
        # code here
        #algorithm, ans if exist, it must be end time of an interval
        # sort intervals by its start time. 
        # loop through intervals, pop all the events that no longer 
        # invalid if current event will be considered.
        # if # of events in the query >=k, then the smallest
        # end time will be best so far
        
        from heapq import heappush, heappop
        
        intervals.sort()
        q, ans = [], -1
        for start, end in intervals:
            while q and q[0] < start:
                heappop(q)
            heappush(q, end)
            while len(q) >= k:
                ans = max(ans, heappop(q))
    
        while len(q) >= k:
            ans = max(ans, q[0])
            heappop(q)
        
        return ans
        
