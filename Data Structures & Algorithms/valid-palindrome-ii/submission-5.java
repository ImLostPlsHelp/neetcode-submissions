class Solution {
    public boolean validPalindrome(String s) {
        int right = s.length() - 1;
        int left = 0;

        while(left < right) {
            //Karena ngedelete satu seharusnya bisa, I guess bisa delete yang kanan aja? 
            if(s.charAt(left) != s.charAt(right)) {
                return checkPalindrome(s, left+1, right) || checkPalindrome(s, left, right-1);
            } else {
                left++;
                right--;
            }
        }
        return true;
    }

    private boolean checkPalindrome(String s, int left, int right) {
        while(left < right) {
            if(s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

