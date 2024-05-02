class Solution {
    public int findMaxK(int[] nums) {
        int max = -1;
        int[] arr = new int[2001];
        for(int i : nums){
            if(arr[-i+1000] == 1)
            max = Math.max(max,Math.abs(i));
            else
            arr[i+1000] = 1;
        }
        return max;
    }
}