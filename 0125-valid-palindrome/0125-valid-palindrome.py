class Solution(object):
    def isPalindrome(self, s):
        """
        :type s: str
        :rtype: bool
        """
        if len(s) <= 1:
            return True
        
        newStr = ""
        for ch in s:
            if ch.isalnum():
                newStr = newStr+ch.lower()
        
        revStr = newStr[-1::-1]
        # print("newStr: ", newStr)
        # print("revStr: ", revStr)
        return revStr == newStr