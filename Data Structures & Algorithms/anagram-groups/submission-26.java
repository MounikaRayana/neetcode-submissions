class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<String> anagrams = new ArrayList<>();
        List<List<String>> result = new ArrayList<>();
        Map<String, List<String>> anagram_map = new HashMap<>();
        if (strs.length == 1) {
            anagrams.add(strs[0]);
            result.add(anagrams);
        }
        if (strs.length > 1) {
            for (String original : strs) {
                char[] chars = original.toCharArray();
                Arrays.sort(chars);
                String sorted = new String(chars);
                anagram_map.computeIfAbsent(sorted, k -> new ArrayList<>()).add(original);
            }
            return new ArrayList<>(anagram_map.values());
        }
        return result;
    }
}
