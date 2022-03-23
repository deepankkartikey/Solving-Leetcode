class Solution {
    public int brokenCalc(int startValue, int target) {
        // special case: when start > target ==> Only allowed operation is subtraction
        // And number of operations are fixed: start - target
        if(startValue >= target)
            return startValue - target;
        // instead of subtracting and multiplying and reaching from startvalue to targetvalue
        // we can do it other way round and move from target towards start
        // this way the number of possibilities are restricted and we can find the minimum number of steps to reach the value
        if(target%2 == 0)
            return 1+brokenCalc(startValue, target/2);
        else 
            return 1+brokenCalc(startValue, target+1);
    }
}