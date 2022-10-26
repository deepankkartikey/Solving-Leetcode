class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        dictionary = {}
        for i,num in enumerate(nums):
            key = target-num
            if key in dictionary:
                return [dictionary[key], i]
            else:
                dictionary[num] = i
                
        return [-1,-1]
        