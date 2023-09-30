class Solution {
    public boolean isSameAfterReversals(int num) {
        int x=reverse(num);
        int y=reverse(x);
        if(y==num)
        return true;
        return false;
        }
        int reverse(int n)
        {
            int rev=0;
            while(n!=0){
            rev = rev*10+n%10;;
            n=n/10;
        }
        return rev;
        }
}