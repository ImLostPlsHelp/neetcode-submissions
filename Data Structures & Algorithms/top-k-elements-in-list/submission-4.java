class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> frequent = new HashMap<>();
        int[] mostFrequent = new int[k];

        for(int i = 0; i < nums.length; i++) {
            if(!frequent.containsKey(nums[i])) {
                frequent.put(nums[i], frequent.getOrDefault(nums[i], 0) + 1);
            } else {
                frequent.put(nums[i], frequent.getOrDefault(nums[i], 0) + 1);
            }
        }

        PriorityQueue<Integer> minHeap = new PriorityQueue<>(
         (n1, n2) -> frequent.get(n1) - frequent.get(n2)   
        );

        for(int num : frequent.keySet()) {
            minHeap.add(num);
            if(minHeap.size() > k) {
                minHeap.poll();
            }
        }

        for(int i = 0; i < k; i++) {
            mostFrequent[i] = minHeap.poll();
        }

        return mostFrequent;
    }
}
