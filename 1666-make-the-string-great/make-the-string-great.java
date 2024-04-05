class Solution {
    public String makeGood(String s) {
        int n = s.length();
        Stack<Character> st = new Stack<>();
        String ans = "";
        st.push(s.charAt(0));
        char[] arr = s.toCharArray();
        for(int i=1; i<n ;i++){
            if(!st.isEmpty() && (st.peek()-arr[i]==32 || st.peek()-arr[i]==-32)){
                st.pop();
            }else{
                st.push(arr[i]);
            }
            
        }
        while(!st.empty()){
            ans=st.pop()+ans;
        }
        return ans;
    }
}