class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i : nums) {
            if(!set.contains(i)) {
                set.add(i);
                continue;
            }
            return i;     
        }
        return 0;
    }
}