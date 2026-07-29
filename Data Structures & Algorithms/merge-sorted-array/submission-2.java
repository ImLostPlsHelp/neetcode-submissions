class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int right = nums1.length-1;
        
        while(m > 0 && n > 0) {
            if(m > 0 && nums1[m-1] > nums2[n-1]) {
                nums1[right] = nums1[m-1];
                m--;
            } else {
                nums1[right] = nums2[n-1];
                n--;
            }
            right--;
        }

        if(n > 0) {
            while(n > 0) {
                nums1[right] = nums2[n-1];
                n--;
                right--;
            }
        }
    }
}