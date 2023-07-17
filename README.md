# First Non-Repeating Character

This Java solution finds the first non-repeating character in a stream of characters using a queue and a hashmap.

## Brief Description

 The `FirstNonRepeating` function in the `Solution` class takes a string as input and returns a string representing the first non-repeating character at each step of the stream. If no such character is found, it appends '#' to the result. The function efficiently keeps track of unique characters and their order of appearance.

## Approach

1. Maintain a hashmap, `charCount`, to store the count of each character encountered in the stream.
2. Use a queue, `uniqueChars`, to keep track of the order in which characters appear.
3. Iterate through each character in the stream.
4. Update the count of the current character in `charCount`.
5. If the count is 1, add the character to `uniqueChars`.
6. While `uniqueChars` is not empty and the count of the character at the front of the queue is greater than 1, remove the character from the queue.
7. If `uniqueChars` is not empty, append the first character in the queue to the result. Otherwise, append '#'.
8. Repeat steps 4-7 for each character in the stream.

## Implementation

The implementation uses a `HashMap` to store the count of each character and an `ArrayDeque` (a type of queue) to store the unique characters in the order they appear. The `FirstNonRepeating` function takes a string `stream` as input and returns a string representing the first non-repeating character at each step.

## Code Example

```java


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
```
##  Time and Space Complexity

Time Complexity: O(n) (where n is the length of the input stream).<br>
Space Complexity: O(k) (where k is the number of unique characters encountered in the stream).
