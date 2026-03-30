class Twitter {
     PriorityQueue<int[] >pq ;
     Map<Integer,List<Integer>>map=new HashMap<>();
     int time;
      
    
    public Twitter() {
    pq=new PriorityQueue<>((a,b)->b[0]-a[0]); 
       time=0;
    }
    
    public void postTweet(int userId, int tweetId) {
        pq.add(new int[]{time++,userId,tweetId});
    }
     
    public List<Integer> getNewsFeed(int userId) {
        int count=0;
        List< int[]>temp=new ArrayList<>();
        List<Integer>list=new ArrayList<>();
     
        while(!pq.isEmpty() &&count<10)
        {
            int[] tweetid=pq.poll();
            int user=tweetid[1];
            if(userId==user||map.containsKey(userId)&&map.get(userId).contains(user))
            {
              list.add(tweetid[2]);
              count++;
              
            }
            temp.add(tweetid);
        
        }
          pq.addAll(temp);
          
        return list;
    }
    
    public void follow(int followerId, int followeeId) {
        if(!map.containsKey(followerId))
        {
        map.put(followerId,new ArrayList<>());
        }
        if(!map.get(followerId).contains(followeeId))
        {
             map.get(followerId).add(followeeId); 
        }  
        
    }
    
    public void unfollow(int followerId, int followeeId) {
        if(followerId==followeeId) return; 
       else if(map.get(followerId).contains(followeeId) )
        {
            map.get(followerId).remove(Integer.valueOf(followeeId));
        }
        else
        {
            return; 
        }
    }
}
