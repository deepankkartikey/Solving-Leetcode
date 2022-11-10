class Solution(object):
    def longestPalindrome(self, s):
        """
        :type s: str
        :rtype: int
        """
        letters = {}
        for i in s:
            if i not in letters:
                letters[i] = 1
            else:
                letters[i] += 1
                
        res = 0
        odd = 0
        
        if len(letters) == 1:
            return letters[s[0]]
        
        for i in letters.values():
            if i > 1:
                if i%2 == 0:  # if count of letters is even, then all of them can contribute towards length of palindromic string
                    res +=i
                else:  # if count of letters is odd, then only n-1 can contribute to length of palindromic string and 1 should be kept for last step i.e. filling middle/ pivot
                    res += (i-1)
                    odd += 1
            else:
                odd += 1
                
        if odd > 0:  # if any odd count letters were found; only one out of them can be used to fill a position in a palindromic string
            res +=1
        
        return res