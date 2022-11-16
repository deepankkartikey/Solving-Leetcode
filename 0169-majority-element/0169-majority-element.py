class Solution(object):
    def majorityElement(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        count = {}
        res, maxCnt = 0, 0
        
        for num in nums:
            count[num] = 1 + count.get(num, 0)
            res = num if count[num] > maxCnt else res
            maxCnt = max(count[num], maxCnt)
        
        return res