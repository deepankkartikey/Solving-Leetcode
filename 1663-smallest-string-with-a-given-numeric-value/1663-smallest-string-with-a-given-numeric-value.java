class Solution {
    public String getSmallestString(int n, int k) {
        // keep array of given n length
        char []res = new char[n];
        int i=0;
        // initialize all indices with 'a'
        while(i<n){
            res[i] = 'a';
            i++;
        }
        k = k-n;
        // start traversing from the end --> Lexographically Smallest Needed (GIVEN)
        int j = n-1;
        while(k > 0){
            // if k value is greater than 25, just put character as 'z' and move to next element
            if(k >= 25){
                res[j] = 'z';
                k = k-25;
            }
            // if k value is less than 25, convert it to character and put char value at current index
            else{
                res[j] = (char)('a'+k);
                k = 0;
            }
            j--;
        }
        // return answer as String
        return new String(res);
    }
}