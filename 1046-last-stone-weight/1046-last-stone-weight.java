class Solution {
    public int lastStoneWeight(int[] stones) {
        // using max-heap logic  
        PriorityQueue<Integer> bag = new PriorityQueue<>();
        
        // create a max heap from given stone weights
        // PriorityQueue stores elements as min heap by default
        // negating each weight helps to make it max heap
        for(int stone: stones)
            bag.add(-stone);
        
        while(bag.size() > 1){
        int firstStone = -bag.remove();
        int secondStone = -bag.remove();
        if(firstStone != secondStone)
            bag.add(-(firstStone-secondStone));
        }
        
        return bag.size() > 0 ? -bag.remove() : 0;
    }
}