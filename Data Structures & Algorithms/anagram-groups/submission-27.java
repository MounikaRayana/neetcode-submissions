class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagram_map = new HashMap<>();
        for (String original : strs) {
                char[] chars = original.toCharArray();
                Arrays.sort(chars);
                String sorted = new String(chars);
                anagram_map.computeIfAbsent(sorted, k -> new ArrayList<>()).add(original);
            }
            return new ArrayList<>(anagram_map.values());

    }
}
