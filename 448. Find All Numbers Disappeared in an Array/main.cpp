class Solution {
public:
    vector<int> findDisappearedNumbers(vector<int>& nums) {
        int size = nums.size();
        int arr[size];
        memset(arr, 0, size * sizeof(int));

        for (int i = 0; i < size; i++) {
            arr[nums[i] - 1] = 1;
        }
        nums.clear();

        for (int i = 0; i < size; i++) {
            if (arr[i] != 1) {
                nums.push_back(i + 1);
            }
        }
        return nums;
    }
};
