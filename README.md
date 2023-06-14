# Max Diamonds 

This is a solution for the "Max Diamonds" problem implemented in Java.

## Problem Description

You are given an array `A` of length `N` representing the number of diamonds in different piles. You need to find the maximum number of diamonds you can collect by performing the following operation `K` times:
- Choose a pile with the maximum number of diamonds.
- Collect all the diamonds from that pile.
- Divide the number of diamonds in the chosen pile by 2 and put them back into the pile.

## Approach

The solution approach involves using a priority queue to keep track of the piles with the maximum number of diamonds. The steps are as follows:

1. Create a priority queue, `p`, with reverse ordering to store the diamond piles.
2. Add all the elements of array `A` to the priority queue.
3. Initialize a variable `sum` to 0 to store the sum of collected diamonds.
4. Iterate `K` times:
   - Remove the pile with the maximum number of diamonds from the priority queue and store it in `temp`.
   - Add `temp` to `sum`.
   - Divide `temp` by 2 and add the result back to the priority queue.

5. Return the value of `sum`, which represents the maximum number of diamonds collected.

## Code

```java
class Solution {
    static long maxDiamonds(int[] A, int N, int K) {
        PriorityQueue<Integer> p = new PriorityQueue<>(Collections.reverseOrder());
        for (int x : A)
            p.add(x);
        long sum = 0;
        for (int i = 0; i < K; i++) {
            int temp = p.remove();
            sum += temp;
            p.add(temp / 2);
        }
        return sum;
    }
}
```
## Complexity Analysis

The time complexity of the solution is O(K log N), where N is the length of the input array.<br>The space complexity is O(N) to store the priority queue.
