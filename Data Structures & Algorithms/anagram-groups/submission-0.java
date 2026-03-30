class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>>map=new HashMap<>();

        for(int i=0;i<strs.length;i++)
        {
            char [] charsort=strs[i].toCharArray();
            Arrays.sort(charsort);
            String sorted=new String(charsort);
            if(!map.containsKey(sorted))
            {
              map.put(sorted,new ArrayList<>());
            }
         map.get(sorted).add(strs[i]);
          
        }
        return new ArrayList<>(map.values());
    }
}
