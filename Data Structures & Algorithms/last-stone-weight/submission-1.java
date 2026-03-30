class Solution {
    public int lastStoneWeight(int[] stones) {
         PriorityQueue<Integer>pq=new  PriorityQueue<>(Collections.reverseOrder());
         for(int stone:stones)
         {
            pq.add(stone);
         }
         while(pq.size()>1)
         {
            int one=pq.poll();
            int two=pq.poll();
            if(one==two)
            {
                continue;
            }
            else
            {
                pq.add( one-two);
            }
         }
         return pq.isEmpty()?0:pq.poll();
    }
}
