class RandomizedSet {
    HashMap<Integer,Integer>map;
    ArrayList<Integer>arr;
    public RandomizedSet() {
        map=new HashMap<>();
        arr=new ArrayList<>();
    }
    public boolean search(int val){
        return map.containsKey(val);
    }
    
    public boolean insert(int val) {
        if(search(val)) return false;
        arr.add(val);
        map.put(val,arr.size()-1);
        return true;

    }
    
    public boolean remove(int val) {
        if(!search(val)) return false;
        int index=map.get(val);
        arr.set(index,arr.get(arr.size()-1));
        map.put(arr.get(index),index);
        arr.remove(arr.size()-1);
        map.remove(val);
        return true;
    }
    
    public int getRandom() {
        Random rand=new Random();
        return arr.get(rand.nextInt(arr.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */