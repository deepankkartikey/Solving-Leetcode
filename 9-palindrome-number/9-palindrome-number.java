class Solution {
    public boolean isPalindrome(int x) {
        // convert number to character array
        char[] str = String.valueOf(x).toCharArray();
        int idx = 0;
        int n = str.length;
        // traverse half of array and check palindromic condition
        while(idx <= n/2){
            // if condition broke
            if(str[idx] != str[n-idx-1])
                return false;
            idx++;
        }
        // if condition didn't break
        return true;
    }
}