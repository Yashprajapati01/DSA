class Solution {
    public boolean isSubsequence(String s, String t) {
      int i = 0, j = 0;  // Initialize indices for both strings

        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;  // Move to the next character in string s
            }
            j++;  // Always move to the next character in string t
        }

        // If i reaches the length of s, it means all characters in s have been found in t
        return i == s.length();  
    }
}