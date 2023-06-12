

<body>
  <h1>kLargest Elements Finder</h1>

  <p>This file contains a Java program that finds the k largest elements from an input array,Given an array of integers arr, the program aims to find the k largest elements from the array.</p>

 

  <h2>Approach</h2>

  <p>The program follows a simple approach to solve the problem:</p>

  
<ol>
        <li>Sort the input array in ascending order using the <code>Arrays.sort()</code> method.</li>
        <li>Declare a new array <code>a</code> of size <code>k</code> to store the <code>k</code> largest elements.</li>
        <li>Initialize an index variable <code>i</code> to 0.</li>
        <li>Iterate through the sorted array in reverse order.</li>
        <li>In each iteration, assign the current element from the sorted array to the <code>i</code>th index of the <code>a</code> array and increment <code>i</code> by 1.</li>
        <li>Return the <code>a</code> array, which now contains the <code>k</code> largest elements from the input array.</li>
    
  </ol>
 
 

  <pre><code>//Driver code
  class Solution {
    int[] kLargest(int[] arr, int n, int k) {
        // code here
        Arrays.sort(arr);
        int a[] =new int [k];
        int i=0;
       while(k-->0){
      a[i]=arr[arr.length-1-i];
          i++;
       }
      return a;  
    }
}
  </code></pre>

  <h2>Complexity Analysis</h2>

  <p>The time complexity of this solution is <code>O(n log n + k)</code>, where <code>n</code> is the total number of postive integer.<br> The space complexity is <code>O(k)</code> as for space complexity, the code utilizes additional space to store the 'a' array of size 'k'. 

 

</body>

</html>
