class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> result = new ArrayList<int[]>();
        
        if(intervals.length==0){
            return intervals;
        }
        
        Arrays.sort(intervals, (a,b) -> a[0] - b[0]);
        
        result.add(intervals[0]);
        int count = 0;  //pointer for result
        for(int i = 1; i < intervals.length; i++){
            int[] now = result.get(count);
            if(now[1] >= intervals[i][0]){
                now[1] = Math.max(now[1], intervals[i][1]);
            }else{
                count++;
                result.add(intervals[i]);
            }
        }
        return result.toArray(new int[0][]);
    }
}
