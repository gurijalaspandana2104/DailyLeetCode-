class Solution {
    public boolean isPalindrome(String s) {
       String[] str=s.split(" ");
       String joined=String.join("",str);
       char[] splitted=joined.toLowerCase().toCharArray();
       int left=0;
       int right=splitted.length-1;
       while((left<right))
       {
        while(left<right &&!(Character.isLetterOrDigit(splitted[left])))
        {
            left++;
        }
        while(left<right &&!(Character.isLetterOrDigit(splitted[right])))
        {
            right--;
        }

        if(splitted[left]==splitted[right])
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
