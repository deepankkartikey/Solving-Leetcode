class Solution(object):
    def canConstruct(self, ransomNote, magazine):
        """
        :type ransomNote: str
        :type magazine: str
        :rtype: bool
        """
        freq = {}
        for c in magazine:
            if c not in freq:
                freq[c] = 1
            else:
                freq[c] += 1
                
        for c in ransomNote:
            if c not in freq or freq[c] == 0:
                return False
            else:
                freq[c] -= 1
         
        return True