class Solution {
    public boolean validPalindrome(String s) {
        char[] word = s.toCharArray();
        int right = s.length() - 1;
        int left = 0;

        while(left < right) {
            //Karena ngedelete satu seharusnya bisa, I guess bisa delete yang kanan aja? 
            if(word[left] != word[right]) {
                return checkPalindrome(word, left+1, right) || checkPalindrome(word, left, right-1);
            } else {
                left++;
                right--;
            }
        }
        return true;
    }

    private boolean checkPalindrome(char[] word, int left, int right) {
        while(left < right) {
            if(word[left] != word[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

