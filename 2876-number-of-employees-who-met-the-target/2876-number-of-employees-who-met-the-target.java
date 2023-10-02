class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
      int a=0;
        for(int i:hours){
            if(i>=target)
            a++;
        }
        return a;
    }
}