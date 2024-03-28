class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int res = 0;
        int l = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int r = 0; r < nums.length; r++) {
            map.put(nums[r], map.getOrDefault(nums[r], 0) + 1);
            while (map.get(nums[r]) > k) {
                map.put(nums[l], map.get(nums[l]) - 1);
                l++;
            }
            res = Math.max(res, r - l + 1);
        }
        return res;
    }
}