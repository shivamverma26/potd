// Driver Code
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
