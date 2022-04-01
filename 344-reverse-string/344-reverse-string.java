class Solution {
    public void reverseString(char[] s) {
        int n = s.length;
        // swap ith and (n-i)th character until half of the string
        for(int i=0; i<n/2; i++){
            char temp = s[i];
            s[i] = s[n-i-1];
            s[n-i-1] = temp;
        }
    }
}