class Solution {
    public void sortColors(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        int mid = 0;
        int container = 0;

        while(mid <= right) {
            if(nums[mid] == 0) {
                container = nums[mid];
                nums[mid] = nums[left];
                nums[left] = container;
                left++;
                mid++;
            } else if (nums[mid] == 2) {
                container = nums[mid];
                nums[mid] = nums[right];
                nums[right] = container;
                right--;
            } else {
                mid++;
            }
        }
    }
}