class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Arrays.sort(nums);
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for(int i = 0; i < nums.length - 1; i++) {
            if(nums[i] == nums[i+1] && (i+1) <= nums.length - 1) {
                ans.add(nums[i]);
            }
        }
        return ans;
    }
}