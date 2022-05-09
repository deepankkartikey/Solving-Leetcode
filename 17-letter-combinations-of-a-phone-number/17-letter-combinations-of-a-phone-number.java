class Solution {
    public List<String> letterCombinations(String digits) {
        LinkedList<String> op = new LinkedList<>();
        if(digits.length()==0)
            return op;
        
        op.add("");
        
        String []chr_map = {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        
        for(int i=0; i<digits.length(); i++){
            int idx = Character.getNumericValue(digits.charAt(i));
            
            while(op.peek().length() == i){
                String permut = op.remove();
                for(char c: chr_map[idx].toCharArray())
                    op.add(permut+c);
            }
        }
        return op;
    }
}