class Solution {
    public String mergeAlternately(String word1, String word2) {
        int left=0;
        int right=0;
        String str="";
        while(left< word1.length() &&right< word2.length())
        {
        str=str+word1.charAt(left);
       str= str+word2.charAt(right);
        left++;
        right++;
        }
        if(left==word1.length()&&right<word2.length())
        {
           str = str+word2.substring(  right,word2.length());
        }
        else if(right==word2.length()&&left<word1.length())
        {
            str=str+word1.substring( left,word1.length());
        }
        return str;
    }
}