class Solution {
    public int firstMissingPositive(int[] nums) {
        boolean check=false;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1)
            check = true;
            if(nums[i] <= 0 || nums[i] > nums.length)
            nums[i]=1;
        }
        if(check == false) return 1;
        for(int i=0;i<nums.length;i++){
            int num = Math.abs(nums[i]);
            if(nums[num-1]<0)
            continue;

            nums[num-1] *= -1;
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0)
            return i+1;
        }
        return nums.length+1;
    }
}