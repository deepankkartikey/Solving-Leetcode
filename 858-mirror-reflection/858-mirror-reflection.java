class Solution {
    public int mirrorReflection(int p, int q) {
        // extension*p = reflection*q
        // if extension = even and reflection = odd, result is 0
        // if extension = odd and reflection = even, result is 2
        // if extension = odd and reflection = odd, result is 1
        
        int ext = q, ref = p;
        while(ext%2 == 0 && ref%2 == 0){
            ext /= 2;
            ref /= 2;
        }
        if(ext%2==0 && ref%2!=0)
            return 0;
        else if(ext%2!=0 && ref%2==0)
                return 2;
        else if(ext%2!=0 && ref%2!=0)
                return 1;
        return -1;
    }
}