//Driver Code
//User function Template for Java
class Solution {
    static long maxDiamonds(int[] A, int N, int K) {
        // code here
        PriorityQueue <Integer> p=new PriorityQueue<>(Collections.reverseOrder());
        for(int x:A)
        p.add(x);
        long sum =0;
        for(int i=0;i<K;i++){
            int temp =p.remove();
            sum+=temp;
            p.add(temp/2);
              
       }return sum;
    }
};
