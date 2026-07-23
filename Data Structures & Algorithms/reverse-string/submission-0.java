class Solution {
    public void reverseString(char[] s) {
        char container;
        int right = s.length - 1;

        for(int i = 0; i < s.length; i++) {
            if(right < i) {
                break;
            }
            container = s[right];
            s[right] = s[i];
            s[i] = container;
            right--;
        }
    }
}