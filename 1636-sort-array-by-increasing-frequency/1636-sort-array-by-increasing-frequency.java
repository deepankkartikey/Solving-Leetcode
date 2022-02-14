class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        
        // create a map by counting occurence of each element
        Arrays
            .stream(nums)
            .forEach(num -> map.put(num, map.getOrDefault(num,0)+1));
        
        // Sort Map first by frequency in ascending,
        // and then by number in descending
        return Arrays
            .stream(nums)
            .boxed()
            .sorted((a,b) -> map.get(a)!=map.get(b) ? map.get(a)-map.get(b) : b-a)
            .mapToInt(num -> num)
            .toArray();   
    }
    
}