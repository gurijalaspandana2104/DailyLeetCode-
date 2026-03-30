class Solution {
    public List<Integer> partitionLabels(String s) {
        HashMap<Character,Integer>hmap=new HashMap<>();
        List<Integer>list=new ArrayList<>();
        for(int i=0;i<s.length();i++)
        {
            
                hmap.put(s.charAt(i),i);
             
        }
        int  size=0;
        int end=0;
        for(int i=0;i<s.length();i++)
        {
            end=Math.max(end,hmap.get(s.charAt(i)));
            size++;
            if(i==end)
            {
                list.add(size);
                size=0;
            }


        }
        return list;
    }
}
