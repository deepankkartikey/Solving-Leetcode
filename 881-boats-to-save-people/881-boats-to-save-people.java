class Solution {
    public int numRescueBoats(int[] people, int limit) {
        // sort array of weights of people
        Arrays.sort(people);
        
        // counter to keep track of boats
        int numBoats = 0;
        
        // Taking 2 pointer approach
        int first = 0;
        int last = people.length-1;
        while(first <= last){
            // if heaviest and lightest person can adjust in a boat
            if(people[first]+people[last] <= limit){
                first++;
                last--;
            }
            // else keep heavy person alone in boat
            else
                last--;
            numBoats++;
        }
        return numBoats;
    }
}