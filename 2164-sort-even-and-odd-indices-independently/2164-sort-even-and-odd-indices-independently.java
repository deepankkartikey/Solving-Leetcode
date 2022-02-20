class Solution {
    public int[] sortEvenOdd(int[] nums) {
        // segregate even and odd indices elements into 2 lists
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();
        
        for(int i=0; i<nums.length; i++){
            if(i % 2 == 0)
                even.add(nums[i]);
            else
                odd.add(nums[i]);
        }
        
        // sort both lists
        Collections.sort(even);
        Collections.sort(odd);
        // reverse the odd indices list (descending order)
        Collections.reverse(odd);
        
        // create ans array and return
        int j=0;
        int k=0;
        int[] ans = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            if(i%2==0)
                ans[i] = even.get(j++);
            else
                ans[i] = odd.get(k++);
        }
        return ans;
    }
}