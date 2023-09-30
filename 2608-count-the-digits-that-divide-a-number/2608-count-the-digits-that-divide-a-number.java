class Solution {
    public int countDigits(int num) {
        int a=0;
        int num1=num;
        while(num!=0){
            int d=num%10;
            if(num1%d==0)
            a++;
            num=num/10;
        }
        return a;
    }
}