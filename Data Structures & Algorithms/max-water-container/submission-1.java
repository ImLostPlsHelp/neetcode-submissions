class Solution {
    public int maxArea(int[] heights) {
        //I can understand the solution now I think. Bascially what we need to find
        //is the area of the rectangle formed by the two bars. For example:
        //in the pic, the five bars form six areas of water and the smaller of the two bars
        //is 6, which is the length and the waters are the length.

        int right = heights.length-1;
        int left = 0;
        int result = 0;

        while(right > left) {
            int currentArea = Math.min(heights[right] * (right-left), heights[left] * (right-left));
            if(currentArea > result) {
                result = currentArea;
            }

            if(heights[left] <= heights[right]) {
                left++;
            }
            else if(heights[left] >= heights[right]) {
                right--;
            }
        }

        return result;
    }
}
