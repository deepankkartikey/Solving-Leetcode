class Solution(object):
    def validIPAddress(self, queryIP):
        """
        :type queryIP: str
        :rtype: str
        """
        digits = set('0123456789')
        hexDigits = set('0123456789abcdefABCDEF')
        
        def validateIPV4(queryIP):
            for block in queryIP.split('.'):
                if not valid_IPV4(block):
                    return "Neither"
            return "IPv4"
        
        def valid_IPV4(block):
            if not block: return False
            if block[0] == '0' and len(block)>1: return False
            if not set(block).issubset(digits): return False
            return 0 <= int(block) <= 255
        
        def validateIPV6(queryIP):
            for block in queryIP.split(':'):
                if not valid_IPV6(block):
                    return "Neither"
            return "IPv6"
        
        def valid_IPV6(block):
            if not block: return False
            if not set(block).issubset(hexDigits): return False
            return len(block) <= 4
        
        
        if queryIP.count('.') == 3:
            return validateIPV4(queryIP)
        elif queryIP.count(':') == 7:
            return validateIPV6(queryIP)
        else:
            return "Neither"