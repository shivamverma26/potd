

<body>
  <h1>Cut Rod Problem - Dynamic Programming Solution</h1>

  <p>This code implements a dynamic programming solution to the cut rod problem. The cut rod problem is a classic optimization problem in computer science, where the goal is to determine the maximum obtainable value by cutting a rod into smaller pieces and selling them at different prices.</p>

 

  <h2>Approach</h2>

  <p>The code uses a dynamic programming approach to solve the cut rod problem. It utilizes an ArrayList <code>li</code> to store the maximum obtainable value for each rod length from 1 to <code>n</code>.</p>

  <p>The algorithm iterates over each rod length from 1 to <code>n</code> and calculates the maximum obtainable value for that length by considering all possible cuts. It uses a nested loop to iterate over all possible cuts and determines the maximum value by taking the maximum of the current maximum value and the sum of the price of the current cut and the maximum obtainable value for the remaining length.</p>

  <p>Finally, the code returns the maximum obtainable value for the given rod length <code>n</code>.</p>

 

  <pre><code>//Driver code
   class Solution{
     public int cutRod(int price[], int n) {
       ArrayList<Integer> li = new ArrayList<>();
        li.add(0);
        
        for (int i = 1; i <= n; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = 0; j < i; j++) {
                max = Math.max(max, (price[j] + li.get(i - j - 1)));
            }
            li.add(max);
        }
      
        return li.get(n);
    }
}
  </code></pre>

  <h2>Complexity Analysis</h2>

  <p>The time complexity of this solution is <code>O(n^2)</code>, where <code>n</code> is the length of the rod.<br> The space complexity is <code>O(n)</code> as the <code>li</code> ArrayList is used to store the maximum obtainable values for each rod length.</p>

  <h2>References</h2>
  <ul>
    <li><a href="https://www.geeksforgeeks.org/cutting-a-rod-dp-13/">Cutting a Rod | DP-13</a></li>
    <li><a href="https://en.wikipedia.org/wiki/Cutting_stock_problem#Rod_cutting_problem">Rod cutting problem</a></li>
  </ul>

</body>

</html>
