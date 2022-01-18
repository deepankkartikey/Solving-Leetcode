class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        // let sA, sB be sum of candies alice and bob have with them
        int sA, sB;
        sA = sB = 0;
        for(int aliceSize: aliceSizes)
            sA += aliceSize;
        for(int bobSize: bobSizes)
            sB += bobSize;
    
        // let a be candies given by Alice to Bob
        // let b be candies given by Bob to Alice    
        // a = (sA-sB)/2 + b
        int diff = (sA-sB)/2;
        // aliceSizes has to be sorted first to apply binary search
        Arrays.sort(aliceSizes);
        // we have to search for an element in aliceSizes s.t. condition can be satisfied 
        for(int b: bobSizes)
            // if some answer is found, return
            if(binarySearch(aliceSizes, diff+b) != -1)
                return new int[]{diff+b, b};
        
        return new int[]{-1,-1};
    }
    
    // basic binary search
    int binarySearch(int arr[], int target){
        int start = 0, end = arr.length-1;
        while(start <= end){
            int mid = start+(end-start)/2;
            if(arr[mid] < target)
                start = mid+1;
            else if(arr[mid] > target)
                    end = mid-1;
            else
                return mid;
        }
        return -1;
    }
}