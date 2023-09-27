class Solution {
    public String defangIPaddr(String address) {
        String s="";
        for(int i=0;i<=address.length()-1;i++)
        {
            char c = address.charAt(i);
            if(c=='.')
            s=s+"[.]";
            else
            s=s+c;

        }
        return s;
    }
}