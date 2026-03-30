class Solution {
    public boolean validPalindrome(String s) {
        int left=0;
        int right=s.length()-1;
        while(left<right)
        {
            if(s.charAt(left)==s.charAt(right) )
            {
                left++;
                right--;
            }
            else
            {
                return ispalindrome(left,right-1,s)||ispalindrome(left+1,right,s);
            }
        }
        return true;

    }
    public boolean ispalindrome(int left,int right,String s)
    {
         
        while(left<right)
        {
            if(s.charAt(left) ==s.charAt(right))
            {
                left++;
                right--;
            }
            else
            {
                return false;
            }
        }
        return true;
    }
}
