class Solution {
    public int climbStairs(int n) {
        int lastNum = 1;
        int secondLastNum = 1;
        int accumulator = 0;
        if(n==1) return 1;
        for(int i = n - 2; i >= 0; i--) {
            accumulator = secondLastNum + lastNum;
            lastNum = secondLastNum;
            secondLastNum = accumulator;
        }
        return accumulator;

    }
}