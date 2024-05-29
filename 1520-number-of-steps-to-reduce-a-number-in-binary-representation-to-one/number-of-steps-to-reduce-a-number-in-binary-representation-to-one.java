class Solution {
    public int numSteps(String s) {
        int count = 0;
        int carry = 0;

        for (int i = s.length() - 1; i > 0; i--) {
            if (s.charAt(i) - '0' + carry == 1) {
                carry = 1;
                count += 2;  // 1 -> add 1 then divide
            } else {
                count += 1;  // 0 -> just divide
            }
        }

        return count + carry;
    }
}
