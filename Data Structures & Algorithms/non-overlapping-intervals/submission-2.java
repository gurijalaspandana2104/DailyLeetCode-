class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int count=0;
        
       
        {
            Arrays.sort(intervals,(a,b)->a[0]-b[0]);
            int[] newinterval=intervals[0];
            for(int i=1;i<intervals.length;i++)
            {
                int[] interval=intervals[i];
                if(interval[0]>=newinterval[1])
                {
                    newinterval=interval;
                }
                
                else
                {
                    count++;
                    if(interval[1]<newinterval[1]){
                 newinterval=interval;  
                }
                }
            }
        }
        return count;
    }
}
