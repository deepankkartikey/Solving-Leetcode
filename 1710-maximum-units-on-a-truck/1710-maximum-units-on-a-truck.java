class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        // sort the array of boxTypes in descending order
        Arrays.sort(boxTypes, (a,b)->b[1]-a[1]);
        
        // traverse the boxTypes array and calculate max. number of possible units
        int i = 0;
        int totalUnits = 0;
        while(truckSize > 0 && i < boxTypes.length){
            if(boxTypes[i][0] <= truckSize){
                totalUnits += boxTypes[i][0]*boxTypes[i][1];
                truckSize -= boxTypes[i][0];
            }
            else {
                // current number of boxes is greater than trucksize, select partially
                totalUnits += truckSize*boxTypes[i][1];
                truckSize-=truckSize;
            }
            i++;
        }
        return totalUnits;
    }
}