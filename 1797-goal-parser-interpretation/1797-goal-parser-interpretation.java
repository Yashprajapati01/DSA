class Solution {
    public String interpret(String command) {
        String s="";
        for(int i=0;i<command.length();i++)
        {
            if(command.charAt(i)=='G')
            s=s+"G";
            else{
            if(command.charAt(i+1)==')'){
            s=s+"o";
            i++;}
            else{
            s=s+"al";
            i+=3;
        }
    }
        }
        return s;
    }
}