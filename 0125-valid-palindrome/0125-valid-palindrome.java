class Solution {
    public boolean isPalindrome(String s) {
        s=s.trim();
        s=s.toLowerCase();
        String str="";
        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            if((c>='0'&&c<='9')||(c>='a'&&c<='z')||(c>='A'&&c<='Z'))
            str=str+c;
            else
            continue;
        }
        String str1="";
        for(int i=0;i<str.length();i++)
        {
            str1=(str.charAt(i))+str1;
        }
        if(str1.equals(str))
        return true;
        else
        return false;
    }
}