class Solution {

    int maxIndexDiff(int arr[], int n) {
        // code here
         int i=0, j= n-1;
        int maxi = 0;
        
        while(i<j){
            
            if(arr[j] >= arr[i]){
                maxi = Math.max(maxi , j-i);
                i++;
                j=n-1;
            }
            else{
                j--;
            }
        }
        
        return maxi;
    }
}
