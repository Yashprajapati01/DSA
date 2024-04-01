class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String w="",wi="";
        for(String word :   word1) {
            w= w+word;
        }
        for(String wordd : word2) {
            wi= wi+wordd;
        }
        if(w.equals(wi))
            return true;
        else
            return false;
    }
}