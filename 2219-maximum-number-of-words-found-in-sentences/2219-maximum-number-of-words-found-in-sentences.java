class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=0;
       for(int i=0;i<sentences.length;i++){
           int l = fek(sentences[i]); 
           if(l>max)
           max=l;
       }
       return max;
    }
    int fek(String s)
    {
               int i = 0, a = 0;
        while(i<(s.length())){
            if(s.charAt(i)==' '){
                a++;
            }
            i++;
        }
        a++;
        return a;
    }
}