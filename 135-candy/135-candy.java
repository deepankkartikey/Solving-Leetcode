class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;
        int[] candies = new int[n];
        Arrays.fill(candies, 1);
        
        if(n == 1){
            return 1;
        }
        
        // Left to Right
        for(int i=1; i<n; i++){
            if(ratings[i] > ratings[i-1] && candies[i] <= candies[i-1]){
                candies[i] = candies[i-1]+1;
            }
        }
        
        // Right to Left
        for(int i=n-2; i>=0; i--){
            if(ratings[i] > ratings[i+1] && candies[i] <= candies[i+1]){
                candies[i] = candies[i+1]+1;
            }
        }
        
        // sum of candies and return
        int totalCandies = 0;
        for(int i=0; i<n; i++){
            totalCandies += candies[i];
        }
        return totalCandies;
    }
}