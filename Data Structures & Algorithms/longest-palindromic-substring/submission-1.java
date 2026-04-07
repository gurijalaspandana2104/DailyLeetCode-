class Solution {
    public  String expand(String s,int l ,int r)
    {
        while(l>=0&&r< s.length()&&s.charAt(l)==s.charAt(r))
        {
             r++;
             l--;
        }
        return s.substring(l+1,r);
    }
    public String longestPalindrome(String s) {
         String ans="";
         for(int i=0;i<s.length();i++)
         {
            String a= expand(s,i,i);
            String b= expand(s,i,i+1);
            if(a.length()> ans.length())ans=a;
            if(b.length()>ans.length())ans=b;
         }
         return ans;

        
    }
}
