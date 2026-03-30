class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        Stack<  Double> stack=new Stack<>();
        PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->b[0]-a[0]);
        for(int i=0;i<position.length;i++)
        {
              
              pq.add(new int[]{position[i],speed[i]});
        }
        int fleet=0;
        for(int i=0;i<position.length;i++)
        {   int[] car=pq.poll();
        int pos=car[0];
        int spe =car[1];
          double t=(double)(target-pos)/spe ;
          
            
             if(stack.isEmpty()||stack.peek()<t)
            {
             fleet++;
             stack.push(t);
           }
           

        }
        return fleet;
    }
}
