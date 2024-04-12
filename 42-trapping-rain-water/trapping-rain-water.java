class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++){
            leftMax[i] = Math.max(leftMax[i-1], height[i]);
        }
        int rightmax[] = new int[n];
        rightmax[n-1] = height[n-1];
        for (int i = n-2; i >= 0; i--){
            rightmax[i] = Math.max(rightmax[i+1], height[i]);
        }
        int trapped = 0;
        for(int i=0; i<n; i++){
            int water = Math.min(leftMax[i], rightmax[i]);
            trapped += water - height[i];
        }
        return trapped;
    }
}