class Solution {
    public int twoCitySchedCost(int[][] costs) {
        // Sort costs array by amount of profit for City A over City B
        Arrays.sort(costs, (a,b) -> {
           return(a[0]-a[1])-(b[0]-b[1]); 
        });
        
        int total = 0;
        for(int i=0; i<costs.length; i++){
            // since each city is limited to n people and we have to calculate minimum cost
            // send first half people to city A
            // and second half people to city B
            if(i < costs.length/2)
                total += costs[i][0];
            else
                total += costs[i][1];
        }
        return total;
    }
}