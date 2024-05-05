class Solution {
    public String maximumOddBinaryNumber(String s) {
        int zeros = 0;
        int ones = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '1'){
                ones++;
            }else{
                zeros++;
            }
        }
        StringBuilder str = new StringBuilder();
        for(int i=0;i<s.length();i++){
        if(ones>1){
            str.append('1');
            ones--;
        }else if(zeros>0){
            str.append('0');
            zeros--;
        }else{
            str.append('1');
            ones--;
        }
        }
        return str.toString();
    }
}