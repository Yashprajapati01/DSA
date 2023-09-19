class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int a=-1;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]==nums[i+1])
              a=i;
        }
        return nums[a];
    }
}