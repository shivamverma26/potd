 class Solution {
    public String FirstNonRepeating(String stream) {
        Map<Character, Integer> charCount = new HashMap<>();
        Queue<Character> uniqueChars = new ArrayDeque<>();
        StringBuilder result = new StringBuilder();

        for (char ch : stream.toCharArray()) {
            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);

            if (charCount.get(ch) == 1) {
                uniqueChars.add(ch);
            }

            while (!uniqueChars.isEmpty() && charCount.get(uniqueChars.peek()) > 1) {
                uniqueChars.poll();
            }

            if (!uniqueChars.isEmpty()) {
                result.append(uniqueChars.peek());
            } else {
                result.append('#');
            }
        }

        return result.toString();}}
