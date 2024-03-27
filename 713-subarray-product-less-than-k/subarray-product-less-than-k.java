class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k <=1)
        return 0;
        int i=0,j=0;
        int result=0;
        int pro=1;
        while(j<nums.length){
            pro *= nums[j];
            while(pro>=k){
                pro /= nums[i];
                i++;
            }
            result += (j-i+1);
            j++;
        }
        return result;
    }
}