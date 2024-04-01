class Solution {
    public int balancedStringSplit(String s) {
        int ans=0,total=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == 'L') total++;
            else total--;
            if(total == 0) ans++;
        }
        return ans;
    }
}