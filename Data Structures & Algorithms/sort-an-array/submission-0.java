class Solution {
    public int[] sortArray(int[] nums) {
        int[] temp = new int[nums.length];
        mergesort(nums, temp, 0, nums.length-1);
        return nums;
    }

    private void merge(int[] nums, int[] temp, int left, int mid, int right) {
            //Copy both halves into the temp array
            for(int i = left; i <= right; i++) {
                temp[i] = nums[i];
            }

            //set pointers for left half, right half, and left half to put elements back into nums
            int l = left;
            int r = mid+1;
            int k = left;

            //Traverse both halfs and place smaller elements into nums
            while(l <= mid && r <= right) {
                if(temp[l] <= temp[r]) {
                    nums[k] = temp[l];
                    l++;
                } else {
                    nums[k] = temp[r];
                    r++;
                }
                k++;
            }

            //Put everything in the left element into nums, no need to do it for right 
            //since it's automatically in the correct position
            while(l <= mid) {
                nums[k] = temp[l];
                l++;
                k++;
            }
        }

        private void mergesort(int[] nums, int[] temp, int left, int right) {
            //If array is 1/0, can just return since it's sorted
            if(left >= right) {
                return;
            }

            //Find middle
            int mid = left + (right - left) / 2;

            //recursively split
            mergesort(nums, temp, left, mid);
            mergesort(nums, temp, mid+1, right);

            //Finally merge
            merge(nums, temp, left, mid, right);
        }
}