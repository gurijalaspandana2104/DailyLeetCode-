class Solution {
    public int characterReplacement(String s, int k) {
        int maxfreq=0;
        int left=0;
       int[] freq=new int[26];
       int result=0;
       for(int right=0;right<s.length();right++)
       {
        char ch=s.charAt(right);
        freq[ch-'A']++;
        maxfreq=Math.max(freq[ch-'A'],maxfreq);
        while((right-left+1)-maxfreq>k)
        {
            freq[s.charAt(left)-'A']--;
            left++;
        }
result=Math.max(right-left+1,result);
       }
       return result; 
    }
}
