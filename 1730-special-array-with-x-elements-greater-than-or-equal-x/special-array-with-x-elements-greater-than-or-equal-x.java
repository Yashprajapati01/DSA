class Solution {
    public int specialArray(int[] nums) {
        int n=nums.length;
        

        for(int x=1;x<=n;x++){
            int c=0;
            for(int j=0;j<n;j++){
                if(nums[j] >= x)
                c++;
            }
            if(c==x){
                return x;
            }
           
        }
         
        return -1;
    }
}