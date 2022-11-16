class Solution(object):
    def majorityElement(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        cnt, res = 0, 0
        
        for num in nums:
            if cnt == 0:
                res = num
            if num != res:
                cnt -= 1
            else:
                cnt += 1
        
        return res