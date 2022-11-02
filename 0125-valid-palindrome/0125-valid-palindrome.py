class Solution(object):
    def isPalindrome(self, s):
        """
        :type s: str
        :rtype: bool
        """
        if len(s) <= 1:
            return True
        
        newStr = [ch.lower() for ch in s if ch.isalnum()]
        return newStr == newStr[::-1]