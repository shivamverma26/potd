<!-- Implementation Details -->
  <h2>Implementation Details</h2>
    <p>This repository contains a Java solution for counting the number of set bits in a given integer.</p>
   <h2>Approach</h2>

<p>The approach to count the number of set bits in a given integer is as follows:</p>

<ol>
    <li>Initialize a variable <code>res</code> to 0. This variable will store the count of set bits.</li>
    <li>Iterate while <code>N</code> is greater than 0:</li>
    <ul>
        <li>Check if the least significant bit of <code>N</code> is set (i.e., not equal to 0) by performing the modulo operation with 2 (i.e., <code>N % 2 != 0</code>).</li>
        <li>If the least significant bit is set, increment <code>res</code> by 1.</li>
        <li>Right-shift <code>N</code> by 1 bit to discard the least significant bit (equivalent to <code>N = N / 2</code>).</li>
    </ul>
    <li>Return the value of <code>res</code> as the result, which represents the count of set bits in the binary representation of the given integer.</li>
</ol>
  <!-- Code -->
    <h3>Code</h3>
    <pre><code>
     class Solution {
    static int setBits(int N) {
        // code here
          int res=0;
        while(N>0){
            if(N%2!=0){
                res++;
            }
            N=N/2;
        }
        return res;
    }
     }
         </code></pre>
     <!-- Time Complexity -->
    <h3>Time Complexity</h3>
    <p>The time complexity of the <code>setBits</code> method is O(log N), where N represents the value of the input integer.</p>
   <!-- Space Complexity -->
    <h3>Space Complexity</h3>
    <p>The space complexity of the solution is O(1), as it only requires a single variable to store the count of set bits.</p>
     <!-- Usage -->
    <h2>Usage</h2>
    <p>To use the <code>setBits</code> method in your code:</p>
    <ol>
        <li>Copy the <code>Solution</code> class into your Java project.</li>
        <li>Call the <code>setBits</code> method with an integer <code>N</code> as an argument.</li>
        <li>Capture the returned value, which represents the count of set bits in the binary representation of <code>N</code>.</li>
        <li>Utilize the count as required in your program.</li>
    </ol>
  
  

