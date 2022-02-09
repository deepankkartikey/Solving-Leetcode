class Solution {
    public int[] arrayRankTransform(int[] arr) {
        
        // using a TreeMap approach
        TreeMap<Integer, Integer> mapper = new TreeMap<>();
        
        // first put all elements into a treemap, which eventually sorts them
        for(int num: arr){
            mapper.put(num, 0);
        }    
        
        // assign rank as per position in treemap
        int rank = 1;
        for(Map.Entry<Integer, Integer> entry: mapper.entrySet()){
            entry.setValue(rank++);
        }
        
        // replace element with rank in array
        for(int idx=0; idx<arr.length; idx++){
            if(mapper.containsKey(arr[idx])){
                arr[idx] = mapper.get(arr[idx]);
            }       
        }
        return arr;
    }
}