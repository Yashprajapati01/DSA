class Solution {
    public String reverseWords(String s) {
        String rev="";
        String[] words = s.split("\\s+");
        for(int i=0;i<words.length;i++)
        rev=rev+reverse(words[i]);
        rev=rev.trim();
        return rev;
    }
    String reverse(String a)
    {
        StringBuilder sb = new StringBuilder(a);
        sb.reverse();
        sb.append(" ");
        String b= sb.toString();
        return b;
    }
}