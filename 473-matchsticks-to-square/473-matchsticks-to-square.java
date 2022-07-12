class Solution {
    public boolean makesquare(int[] matchsticks) {
        if(matchsticks.length==0)
            return false;
        
        // optimization 1
        // if any matchstick length is greater than target, return false
        // as we cannot break a matchstick
        int sum = 0;
        for(int matchstick:matchsticks){
            sum += matchstick;
        }
        int target = sum/4;
        
        Arrays.sort(matchsticks);
        for(int matchstick: matchsticks){
            if(matchstick > target)
                return false;
        }
        
        
        int[] sides = new int[4];
        return dfs(matchsticks, target, sides, 0);
    }
    
    private boolean dfs(int[] matchsticks, int target, int[] sides, int idx){
        if(idx == matchsticks.length){
            if(sides[0]==sides[1] && sides[1]==sides[2] && sides[2]==sides[3]){
                return true;
            }
            return false;
        }
        
        for(int i=0; i<4; i++){
            if(sides[i]+matchsticks[idx] > target)
                continue;
            int j=i-1;
            while(j>=0){
                if(sides[j]==sides[i])
                    break;
                j--;
            }
            if(j!=-1)
                continue;
            
            sides[i] += matchsticks[idx];
            if(dfs(matchsticks, target, sides, idx+1))
                return true;
            sides[i] -= matchsticks[idx];
        }
        return false;
    }
}