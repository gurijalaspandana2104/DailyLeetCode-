class Solution {
    public double myPow(double x, int n) { 
        double  a=x;
        long b=n;
        double res=1;
        if(b<0)
        {
            b=-b;
            a=1/a;
        }
        while(b>0)
        {
            if(b% 2==1)
            {
          res=res*a;
            }
            a=a*a;
            b=b/2;
        }
        return res;

    }
}
