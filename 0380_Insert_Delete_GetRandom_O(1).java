class RandomizedSet {
    List<Integer> list; 
    HashMap<Integer, Integer> hash; 
    Random rand;
    
    /** Initialize your data structure here. */
    public RandomizedSet() {
        list = new ArrayList<Integer>();
        hash = new HashMap<Integer, Integer>();
        rand = new Random();
        
    }
    
    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        
        if(hash.containsKey(val)){
            return false;
        }
            
        list.add(val);
        hash.put(val, list.size()-1);
        
        return true;
        
    }
    
    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        
        if(hash.containsKey(val)){
            int index = hash.get(val);
            int value = list.get(list.size()-1);
            list.set(index, value);
            list.remove(list.size()-1);
            hash.replace(value, index);
            hash.remove(val);
            return true;
        }
        
        return false;
    }
    
    /** Get a random element from the set. */
    public int getRandom() {
        return list.get(rand.nextInt(list.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
