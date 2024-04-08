class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int[] arr = new int[2];
        for(int a : students){
            arr[a]++;
        }
        for(int i = 0; i<students.length;i++){
            int sa = sandwiches[i];
            if(arr[sa] == 0){
                return students.length-i;
            }
            arr[sa]--;
        }
        return 0;
    }
}