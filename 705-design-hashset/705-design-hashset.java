class MyHashSet {
    
    boolean[] customSet = null;
    public MyHashSet() {
        customSet = new boolean[1000001];
    }
    
    public void add(int key) {
        customSet[key] = true;
    }
    
    public void remove(int key) {
        customSet[key] = false;
    }
    
    public boolean contains(int key) {
        if(customSet[key])
            return true;
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */