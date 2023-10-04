class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<Integer>();
        for(int i= left;i<=right;i++)
        {
            if(isdividing(i))
            list.add(i);
        }
        return list;
    }
    boolean isdividing(int n)
    {
        if(n<=0)
        return false;
        int temp=n;
      while(n>0){
          int d = n%10;
          if( d==0 || (temp%d) != 0 )
          return false;
          n=n/10;
      }
      return true;
    }
}