//Driver Code
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
