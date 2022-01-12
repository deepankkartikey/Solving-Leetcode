class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        // create a search space to find minimum possible bananas to be eaten.
        int maxBananas = Integer.MIN_VALUE;
        for(int pile: piles){
            maxBananas = Math.max(maxBananas, pile);
        }
        
        // search for minimum answer
        int start = 1, end = maxBananas;
        int ans = -1;
        // binary search
        while(start <= end){
            int mid = start + (end-start)/2;
            // if it is possible to eat bananas with mid bananas per hours in h hours
            // current mid is possible answer
            // keep current mid and look for minimum in first part of search space
            if(isPossible(piles, mid, h)){
                ans = end;
                end = mid-1;
            }
            // else move to second part of search space
            else 
                start = mid+1;
        }
        return start;
    }
    
    // method to check, if possible to eat k bananas in h hours
    boolean isPossible(int[] piles, int eatingLimitPerHour, int hoursLimit){
        int hoursTaken = 0;
        for(int pile: piles){
            hoursTaken += pile/eatingLimitPerHour;
            // if number of bananas left is less than eatingLimitPerHour
            if(pile % eatingLimitPerHour != 0)
                hoursTaken ++;
        }
        // if eating hours exceed the limit => not possible to eat 
        if(hoursTaken > hoursLimit)
            return false;
        return true;
    }
}