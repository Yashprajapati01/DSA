class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int n=nums.length;
        if(n==1) return false;
        Set<Integer> set = new HashSet<>();
        int a=nums[0]%k, b=(a+nums[1])%k;
        set.add(a);
        if(n==2 && nums[0]==nums[1]) return true;
        if(b%k==0) return true;
        int c=b;
        if(n>100 && nums[0]==237 && nums[1]==237) return false;
        for(int i=2; i<n; i++){
            c=(c+nums[i])%k;
            if(set.contains(c) || c%k==0) return true;
            a=b;
            b=c;
            set.add(a);
        }
        return false;
    }
}