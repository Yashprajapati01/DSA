class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
      Arrays.sort(hours);
      int a=0;
        for(int i=0;i<hours.length;i++){
            if(hours[i]>=target)
            a++;
        }
        return a;
    }
}