class Solution(object):
    def reverseWords(self, s):
        """
        :type s: str
        :rtype: str
        """
        words = s.strip().split()
        for word in words:
            if " " not in word:
                word = word[-1:]
        words.reverse()
        words = " ".join(words)
        words = words.strip()
        return words
        