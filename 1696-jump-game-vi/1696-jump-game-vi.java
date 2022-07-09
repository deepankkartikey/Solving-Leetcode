class Solution {
    public int maxResult(int[] nums, int k) {
        Deque<Integer> q = new LinkedList<>();
        q.add(0);
        for(int i=1; i<nums.length; i++){
            if(q.peekLast()+k < i){
                q.removeLast();
            }
            nums[i] += nums[q.peekLast()];
            while(!q.isEmpty() && nums[q.peekFirst()] <= nums[i]){
                q.removeFirst();
            }
            q.addFirst(i);
        }
        return nums[nums.length-1];
    }
}