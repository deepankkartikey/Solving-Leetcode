class Solution {
    public int removeElement(int[] nums, int val) {
        int index = 0;
        for (int ele : nums) {
            // replace elements only when not expected element is seen
            if (ele != val) {
                nums[index++] = ele;
            }
        }
        return index;
    }
}