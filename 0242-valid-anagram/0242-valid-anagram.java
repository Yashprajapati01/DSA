class Solution {
    public boolean isAnagram(String s, String t) {
        char[] ch = s.toCharArray();
        char[] ch1= t.toCharArray();
        int a=0;
        Arrays.sort(ch);
        Arrays.sort(ch1);
        String str = String.copyValueOf(ch);
        String str2 = String.copyValueOf(ch1);
        if(str.equals(str2))
        return true;
        else
        return false;
    }
}