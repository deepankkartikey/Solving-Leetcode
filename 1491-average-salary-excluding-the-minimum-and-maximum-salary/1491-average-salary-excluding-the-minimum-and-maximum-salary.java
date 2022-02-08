class Solution {
    public double average(int[] salary) {
        // find min and max salaries
        // calculate sum of all salaries
        double min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        double sum = 0;
        for(int sal: salary){
            sum += sal;
            if(sal < min)
                min = sal;
            if(sal > max)
                max = sal;
        }
        // calculate average excluding min and max salaries
        return (sum-min-max)/(salary.length-2);
    }
}