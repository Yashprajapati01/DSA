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
               String[] words = s.split("\\s+");
               return (words.length);
    }
}