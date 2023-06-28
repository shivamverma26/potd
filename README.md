<h1>Binary Tree Maximum Depth</h1>

<p>This repository contains a Java implementation of calculating the maximum depth of a binary tree.</p>

<h2>Description</h2>

<p>The <code>BinaryTree</code> class provides a method <code>maxDepth</code> that calculates the maximum depth of a binary tree using a recursive approach. The maximum depth of a binary tree is defined as the length of the longest path from the root node to any leaf node.</p>

<h3>Code</h3>

<p>Here's the Java code for the <code>maxDepth</code> method:</p>

<pre>
<code>
class Solution {
  public static int maxDepth(Node root) {
    // code here
     if (root == null)
            return 0;

        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right)); 
  }
}
</code>
</pre>

<h3>Time Complexity</h3>

<p>The time complexity of calculating the maximum depth of a binary tree is <code>O(n)</code>, where <code>n</code> is the number of nodes in the tree. This is because the method visits each node in the tree exactly once.</p>

<h3>Space Complexity</h3>

<p>The space complexity of the <code>maxDepth</code> method is <code>O(h)</code>, where <code>h</code> is the height of the binary tree. In the worst case, when the tree is skewed, the height can be equal to the number of nodes in the tree, resulting in a space complexity of <code>O(n)</code>. However, in a balanced binary tree, the height is <code>log(n)</code>, resulting in a space complexity of <code>O(log(n))</code>.</p>
