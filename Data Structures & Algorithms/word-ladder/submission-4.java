class Solution {
      
     
     
    public int bfs(String beginWord,String endWord,List<String>wordList)
    {
        int  level=1;
    Queue<String>queue=new LinkedList<>();
       
        queue.add(beginWord);
        while(!queue.isEmpty())
        {
            int size=queue.size();
            for(int i=0;i<size;i++)
            {
                String word=queue.poll();
                if(word.equals(endWord))
                {
                    return level;
                } 
                  
                for(int  m=0; m<wordList.size(); m++)
                {
                    int diff=0;
                    String word1=wordList.get( m);
                    
                         for(int k=0;k<word.length();k++)
                         {
                            if(word.charAt(k)!=word1.charAt(k))
                            {
                                diff++;
                                 if(diff>1)
                         {
                            break;
                         }
                            }
                         }
                         
                           if(diff==1)
                         {
                            queue.add(word1);
                            wordList.remove(m);
                                m--;  
                            
                         }
                    
                } 
                  
            }
        level++;
        }
        return 0;
    }
     
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        List<String> list = new ArrayList<>(wordList);
        list.remove(beginWord);
        if(!list.contains(endWord))
        {
            return 0;
        }
        return bfs(beginWord,endWord,list);
    
     
    }
}