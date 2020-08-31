class Solution {
    boolean[] keys = new boolean[1000];    
    int count = 1;
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {  
        keys[0] = true;
        getAllKeys(0, rooms);
        if(count == rooms.size()) return true;
        return false;
    }

    public void getAllKeys(int key, List<List<Integer>> rooms){
        for(int k: rooms.get(key)){
            if(!keys[k]){
                keys[k] = true;
                getAllKeys(k, rooms);
                count++;
            } 
        }
    }
}
