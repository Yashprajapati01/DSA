class Solution {
    public String reversePrefix(String word, char ch) {
        int count = 1;
        StringBuilder st = new StringBuilder();
        for(int i = 0; i < word.length(); i++) {
            if(word.charAt(i) == ch & count == 1) {
                count++;
                for(int j = i; j > -1; j--){
                    st.append(word.charAt(j));
                }
                for(int j = i+1; j < word.length(); j++){
                    st.append(word.charAt(j));
                }
                return st.toString();
            }
        }
        if(count == 1)
        return word;
        return word;
    }
}