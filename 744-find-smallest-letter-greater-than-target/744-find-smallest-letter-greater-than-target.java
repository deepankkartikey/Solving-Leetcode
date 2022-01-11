class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int n = letters.length;
        int start = 0, end = n-1;
        // using binary search
        while(start <= end){
            int mid = start + (end-start)/2;
            // if current letter greater than or equal to target,
            // current element is a possible answer
            // also answer can lie anywhere within first part
            if(letters[mid] > target)
                end = mid-1;
            // if current letter is less than target, answer should be in second part
            else 
                start = mid+1;
        }
        // % n since the character WRAP AROUND
        return letters[start % n];
    }
}