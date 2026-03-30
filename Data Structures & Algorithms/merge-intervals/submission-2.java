class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals==null||intervals.length==0)
        {
            return new int[0][0]; 
        }
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        List< int[]>list=new ArrayList<>(); 
        int[]current=intervals[0]; 
        for(int i=1;i<intervals.length;i++) 
        {
            if(intervals[i][0]>current[1])
            {
                list.add(current);
                current=intervals[i];
            }
            else{
                current[0]=Math.min(current[0],intervals[i][0]);
                current[ 1]=Math.max(current[ 1],intervals[i][ 1]);
            } 
          
        }
        list.add(current);
        return list.toArray(new int[list.size()][]);
        
    }
}
