class Solution {
    public boolean isHappy(int n) {
        if(n==1)
        {
            return  true;
        }
        else if(n==2||n==4)
        {
            return false;
        }
        return isHappy(happyhelper(n));
    }
    public int happyhelper(int n)
    {
        int sum=0;
      
        while(n>0)
        {
          int num=n%10;
          sum+=num*num;
        n=n/10;
         
    } return sum;
    }
}
