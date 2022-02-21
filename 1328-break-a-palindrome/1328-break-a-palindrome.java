class Solution {
    public String breakPalindrome(String palindrome) {
        char[] characters = palindrome.toCharArray();
        // traverse upto half of palindrome
        for(int idx=0; idx<palindrome.length()/2; idx++){
            // change letter to 'a' if any bigger letter found
            // to keep string lexographically smallest
            if(characters[idx]>'a'){
                characters[idx]='a';
                return String.valueOf(characters);
            }
        }
        // if bigger letter not found
        // set last letter to 'b'
        characters[characters.length-1] = 'b';
        
        return characters.length <=1 ? "" : String.valueOf(characters);
    }
}