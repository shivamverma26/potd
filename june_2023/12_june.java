// Driver Code

class Solution{
    public int cutRod(int price[], int n) {
        //code here
       ArrayList<Integer> li = new ArrayList<>();
        li.add(0);
        
        for (int i = 1; i <= n; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = 0; j < i; j++) {
                max = Math.max(max, (price[j] + li.get(i - j - 1)));
            }
            li.add(max);
        }
      
        return li.get(n);
    }
}
