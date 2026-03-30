

class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> res = new ArrayList<>();
        
        if (intervals == null || intervals.length == 0) return new int[0][];
        
        // Step 1: sort intervals by start time
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        
     
        int[] newInterval = intervals[0];
        
        // Step 3: iterate using for-each loop starting from the second interval
        for (int i = 1; i < intervals.length; i++) {
            int[] interval = intervals[i];
            
            if (interval[0] > newInterval[1]) {
                // No overlap → add newInterval to result
                res.add(newInterval);
                newInterval = interval; // start a new interval
            } else {
                // Overlap → merge intervals
                newInterval[0] = Math.min(newInterval[0], interval[0]);
                newInterval[1] = Math.max(newInterval[1], interval[1]);
            }
        }
        
        // Step 4: add the last interval
        res.add(newInterval);
        
        // Step 5: convert list to array
        return res.toArray(new int[res.size()][]);
    }
}

