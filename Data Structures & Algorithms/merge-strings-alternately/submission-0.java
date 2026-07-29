class Solution {
    public String mergeAlternately(String word1, String word2) {
        int left = 0;
        int right = 0;
        StringBuilder merged = new StringBuilder();

        while(left < word1.length() || right < word2.length()) {
            if(left < word1.length()) {
                merged.append(word1.charAt(left));
                left++;
            }
            if(right < word2.length()) {
                merged.append(word2.charAt(right));
                right++;
            }
        }

        return merged.toString();
    }
}