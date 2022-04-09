class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        // create a MAP to store store elements and frequencies
        Map<Integer, Integer> freq = new HashMap<>();
        for(int num: nums)
            freq.put(num, freq.getOrDefault(num, 0)+1);
        
        // Create a max heap based on frequencies
        // get top k elements
        // add those elements to result
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b)-> (b[1]-a[1]));
        for(Map.Entry<Integer, Integer> entry: freq.entrySet()){
            maxHeap.offer(new int[]{entry.getKey(), entry.getValue()});
        }
        
        int[] res = new int[k];
        int i = 0;
        while(i<k){
            int[] current = maxHeap.poll();
            res[i] = current[0];
            i++;
        }
        return res;
    }
}