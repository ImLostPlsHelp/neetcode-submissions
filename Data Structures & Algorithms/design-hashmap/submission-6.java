class MyHashMap {
    List<Integer> key;
    List<Integer> value;

    public MyHashMap() {
        this.key = new ArrayList<>();
        this.value = new ArrayList<>();
    }
    
    public void put(int key, int value) {
        if(!this.key.contains(key)) {
            this.key.add(key);
            this.value.add(value);
        } else {
            this.key.set(this.key.indexOf(key), key);
            this.value.set(this.key.indexOf(key), value);
        }
    }
    
    public int get(int key) {
        if(this.key.contains(key)) {
            return this.value.get(this.key.indexOf(key));
        }
        return -1;
    }
    
    public void remove(int key) {
        int index = this.key.indexOf(key);
        if(index != -1) {
            this.key.remove(index);
            this.value.remove(index);
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */