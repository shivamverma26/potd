<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">

</head>
<body>
  <h1>Quick Sort Algorithm</h1>
  
  <p>This repository contains an implementation of the Quick Sort algorithm in Java. The code provides functions to sort an array using the Quick Sort algorithm.</p>

  <h2>Quick Sort Implementation</h2>

  <p>The Quick Sort algorithm is implemented in the <code>Solution</code> class. The class contains the following methods:</p>

  <pre>
    <code>static void swap(int[] arr, int i, int j)</code>
  </pre>
  <p>A static method to swap two elements in an array.</p>

  <pre>
    <code>static void quickSort(int[] arr, int low, int high)</code>
  </pre>
  <p>A static method to sort an array using Quick Sort. It recursively calls the <code>partition</code> function to divide the array and sort it.</p>

  <pre>
    <code>static int partition(int[] arr, int low, int high)</code>
  </pre>
  <p>A static method to partition the array around a pivot element and return the partition index.</p>
<pre>
  <code>
    
      class Solution
    {
        static void swap(int[] arr, int i, int j)
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        //Function to sort an array using quick sort algorithm.
        static void quickSort(int arr[], int low, int high)
        {
            if (low < high) {
                int pi = partition(arr, low, high);
                quickSort(arr, low, pi - 1);
                quickSort(arr, pi + 1, high);
            }
        }
        
        static int partition(int arr[], int low, int high)
        {
            int pivot = arr[high];
            int i = (low - 1);
  
            for (int j = low; j <= high - 1; j++) {
                if (arr[j] < pivot) {
                    i++;
                    swap(arr, i, j);
                }
            }
            swap(arr, i + 1, high);
            return (i + 1);
        } 
    }
  </code>
</pre>

  <h2>Implementation Approach</h2>

  <p>The Quick Sort algorithm follows a divide-and-conquer approach. The steps involved in the implementation are as follows:</p>

  <ol>
    <li>The <code>quickSort</code> function is the entry point for the quicksort algorithm. It takes an array <code>arr</code>, the lowest index <code>low</code>, and the highest index <code>high</code> as parameters.</li>
    <li>Inside the <code>quickSort</code> function, if <code>low</code> is less than <code>high</code>, it calls the <code>partition</code> function to find the partition index <code>pi</code>.</li>
    <li>After getting the partition index <code>pi</code>, it recursively calls <code>quickSort</code> for the subarrays before and after <code>pi</code>.</li>
  </ol>

  <p>The <code>partition</code> function selects the pivot element as the last element of the array (<code>arr[high]</code>). It rearranges the elements such that all elements smaller than the pivot are placed before it, and all elements greater than the pivot are placed after it. It returns the partition index.</p>

  <h2>Time Complexity</h2>

  <p>On average, the Quick Sort algorithm has a time complexity of <code>O(n log n)</code>, where <code>n</code> is the number of elements in the array.<br>In the worst-case the time complexity can be <code>O(n^2)</code>.</p>

  <h2>Space Complexity</h2>

  <p>The space complexity of the Quick Sort algorithm is <code>O(log n)</code> on average, where <code>n</code> is the number of elements in the array. This space is used for the recursive calls of the algorithm.</p>
</body>
</html>
