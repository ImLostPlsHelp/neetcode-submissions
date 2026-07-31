class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        int l = 0;
        int r = nums.length-1;
        int container = 0;

        while (l < r) {
            container = nums[l];
            nums[l] = nums[r];
            nums[r] = container;
            l++;
            r--;
        }

        l = 0;
        r = k-1;
        while(l < r) {
            container = nums[l];
            nums[l] = nums[r];
            nums[r] = container;
            l++;
            r--;
        }

        l = k;
        r = nums.length-1;
        while(l < r) {
            container = nums[l];
            nums[l] = nums[r];
            nums[r] = container;
            l++;
            r--;
        }
    }
}