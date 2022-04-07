class Solution {
    public int lastStoneWeight(int[] stones) {
        // create a max heap
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->(b-a));
        
        // add all stone weights to heap
        for(int stone: stones)
            pq.offer(stone);
        
        // take top 2 heaviest stones everytime
        // collide and find resultant
        // do this until only one element is left in the heap
        while(pq.size()>1){
            int first = pq.poll();
            int second = pq.poll();
            if(first == second)
                continue;
            else
                pq.offer(first-second);
        }
        return pq.size() == 0 ? 0 : pq.poll();
    }
}