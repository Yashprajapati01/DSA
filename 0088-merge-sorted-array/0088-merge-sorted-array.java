class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
      for(int a=0,i=m;a<n;i++,a++)
      {
          nums1[i]=nums2[a];
      }
      Arrays.sort(nums1);
    }
}