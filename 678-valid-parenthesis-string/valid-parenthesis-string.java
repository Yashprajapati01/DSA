class Solution {
    public boolean checkValidString(String s) {
        Stack<Integer> stk = new Stack<>();
        Stack<Integer> str = new Stack<>();

        for(int i=0; i<s.length();i++){
            if(s.charAt(i) == '(') stk.push(i);
            else if(s.charAt(i) == '*') str.push(i);
            else {
                if(!stk.empty()) stk.pop();
                else if(!str.empty()) str.pop();
                else return false;
            }
        }
        while(!stk.empty() && !str.empty()){
            if(stk.peek() > str.peek()) return false;
            str.pop();
            stk.pop();
            }
            return stk.empty();
    }
}