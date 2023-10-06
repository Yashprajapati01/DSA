class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
        return false;}
        long temp,rev=0;
        temp=x;
        while(x!=0)
        {
         int d=x%10;
         rev=rev*10+d;
         x=x/10;   
        }
        if(temp==rev)
        return true;
        else
        return false;
    }
}