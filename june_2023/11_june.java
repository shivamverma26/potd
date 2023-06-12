//Driver Code
class Solution {

    public static void update(int a[], int n, int updates[], int k)
    {
        // Your code goes here
         for (int i = 0; i < k; i++) {
            int j = updates[i];
            for (int idx = j - 1; idx < n; idx++) {
                a[idx]++; }
                      }
   }
}
