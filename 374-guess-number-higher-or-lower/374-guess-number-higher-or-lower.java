/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is lower than the guess number
 *			      1 if num is higher than the guess number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int start = 1, end = n;
        // using binary search to look for eaxact answer
        while(start <= end){
            int mid = start + (end-start)/2;
            // if current number is greater, look into first part
            if(guess(mid) == -1)
                end = mid-1;
            // if current number is lesser, look into second part
            else if(guess(mid) == 1)
                    start = mid+1;
            // found exact number, return answer
            else if(guess(mid) == 0)
                    return mid;
        }
        return -1;
    }
}
