class Solution {
    public int maxDepth(String s) {
        int max=0,result=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '(') max++;
            else if(s.charAt(i) == ')') max--;
            result = Math.max(result,max);
        }
        return result;
    }
}