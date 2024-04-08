class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int CSW = 0, SSW = 0;

        for (int student : students){
            if (student == 1){
                SSW++;
            } else {
                CSW++;
            }
        }

        for (int sandwiche : sandwiches){
            if (sandwiche == 1 && SSW > 0){
                SSW--;
            } else if (sandwiche == 0 && CSW > 0){
                CSW--;
            } else {
                return SSW + CSW;
            }
        }
        return 0;
    }
}