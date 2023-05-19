class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int lastNum = nums[0];
        boolean dupe = false;
        
        for(int i = 1; i < nums.length; i++) {
            if(lastNum != nums[i] && !dupe){
                return nums[i-1];
            }
            lastNum = nums[i];
            dupe = !dupe;
        }
        return lastNum;
    }
}
