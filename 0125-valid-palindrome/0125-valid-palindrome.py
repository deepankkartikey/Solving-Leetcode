class Solution(object):
    def isPalindrome(self, s):
        """
        :type s: str
        :rtype: bool
        """
        newStr = [ch.lower() for ch in s if ch.isalnum()]
        return newStr == newStr[::-1]