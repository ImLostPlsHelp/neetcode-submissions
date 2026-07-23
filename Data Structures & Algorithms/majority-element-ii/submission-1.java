class Solution {
    public List<Integer> majorityElement(int[] nums) {
       Hashtable<Integer, Integer> elements = new Hashtable<>();
       List<Integer> majorityElements = new ArrayList<>();

       for(int i = 0; i < nums.length; i++) {
            elements.put(nums[i], elements.getOrDefault(nums[i], 0) + 1); 
            if(elements.get(nums[i]) > nums.length/3 && !majorityElements.contains(nums[i])) {
                 majorityElements.add(nums[i]);
            }
        }
        
    return majorityElements;
    }
}