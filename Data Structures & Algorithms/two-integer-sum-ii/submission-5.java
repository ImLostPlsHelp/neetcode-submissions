class Solution {
    public int[] twoSum(int[] numbers, int target) {
        //if the result is smaller, then move left++. If it is bigger, move right--
        int right = numbers.length-1;
        int left = 0;
        int[] result = new int[2];

        while(right > left) {
            int sum = numbers[left] + numbers[right];
            if(sum == target) {
                result[0] = left+1;
                result[1] = right+1;
                break;
            }
            else if (sum > target) {
                right--;
            }
            else if (sum < target) {
                left++;
            }
        }

        return result;
    }
}
