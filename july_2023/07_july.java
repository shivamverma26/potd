class Solution
{
     public static void swap(int i, long[] arr1, int j, long[] arr2){
        long k=arr1[i];
        arr1[i]=arr2[j];
        arr2[j]=k;
    }
    //Function to merge the arrays.
    public static void merge(long arr1[], long arr2[], int n, int m) 
    {
        // code here 
             int i=n-1,j=0;
        while(i>=0 && j<m){
            if(arr1[i]>arr2[j]){
                swap(i,arr1,j,arr2);
                i--;
                j++;   
            }
            else break;
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }
}
