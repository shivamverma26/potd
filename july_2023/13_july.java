class Solution {
    public static boolean isFrequencyUnique(int n, int[] arr) {
        // code here
         HashMap<Integer, Integer> frequencyMap = new HashMap<>();
           for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
                HashSet<Integer> uniqueFrequencies = new HashSet<>(frequencyMap.values());
        boolean allUnique = uniqueFrequencies.size() == frequencyMap.values().size();
return allUnique;

    }
}
        
