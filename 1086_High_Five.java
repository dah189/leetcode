class Solution {
    public int[][] highFive(int[][] items) {
        List<int[]> ans = new ArrayList<int[]>();
        
        Arrays.sort(items, new Comparator<int[]>(){
            public int compare(int[] a, int[] b){
                if(a[0] == b[0]){
                    return b[1] - a[1];
                }else{
                    return a[0] - b[0];
                }
            }
        });
        
        for(int i = 0; i < items.length - 4; i++){
            int sum = 0;
            for(int k = 0; k < 5; k++){
               sum += items[i+k][1]; 
            } 
            int[] item = {items[i][0], sum / 5};
            ans.add(item);
            
            while(i < items.length - 4 && items[i][0] == items[i+1][0]){
                i++;
            }
        }
        
        return ans.toArray(new int[0][]);
    }
}
