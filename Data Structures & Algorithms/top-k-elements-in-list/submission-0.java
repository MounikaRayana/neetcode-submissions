class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> countMap = new HashMap<>();
        int[] result = new int[k];
        for (int number : nums) {
            countMap.merge(number, 1, Integer::sum);
        }
        // Sort keys in descending order of their values
        int[] sortedKeys = countMap.entrySet().stream()
            .sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed())
            .mapToInt(Map.Entry::getKey)
            .toArray();
        for (int i=0; i<k; i++) {
            result[i] = sortedKeys[i];
        }
        return result;
        
    }
}
