class Solution {
    public boolean validPalindrome(String s) {
        int right = s.length() - 1;
        int left = 0;

        while(left < right) {
            char charLeft = s.charAt(left);
            char charRight = s.charAt(right);
            if(!Character.isLetterOrDigit(charLeft)) {
                left++;
            }

            else if(!Character.isLetterOrDigit(charRight)) {
                right--;
            }

            else {
                //Karena ngedelete satu seharusnya bisa, I guess bisa delete yang kanan aja? 
                if(Character.toLowerCase(charLeft) != Character.toLowerCase(charRight)) {
                    boolean kiri = checkPalindrome(s, left+1, right);
                    boolean kanan = checkPalindrome(s, left, right-1);

                    return kiri || kanan;
                } else {
                    left++;
                    right--;
                }
            }
        }
        return true;
    }

    private boolean checkPalindrome(String s, int left, int right) {
        while(left < right) {
            char charLeft = s.charAt(left);
            char charRight = s.charAt(right);
            if(!Character.isLetterOrDigit(charLeft)) {
                left++;
            }
            else if(!Character.isLetterOrDigit(charRight)) {
                right--;
            }
             else {
                if(Character.toLowerCase(charLeft) != Character.toLowerCase(charRight)) {
                    return false;
                }
                left++;
                right--;
            }
        }
        return true;
    }
}
