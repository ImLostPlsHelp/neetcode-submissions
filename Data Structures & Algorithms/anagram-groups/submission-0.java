class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> group = new HashMap<>();

        for(String s : strs) {
            char[] count = new char[26];
            for(char c : s.toCharArray()) {
                count[c - 'a']++;
            }
            String key = new String(count);

            if(group.containsKey(key)) {
                group.get(key).add(s);
            }
            else {
                List<String> list = new ArrayList<>();
                list.add(s);
                group.put(key, list);
            }
        }


        return new ArrayList<>(group.values());
    }
}
