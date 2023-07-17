class Solution
{
    public void transpose(int n,int a[][])
    {
      for (int i = 0; i < n * n; i++) {
    int row = i / n;
    int col = i % n;
    
    if (col > row) {
        int temp = a[row][col];
        a[row][col] = a[col][row];
        a[col][row] = temp;
    }
}  
    }
}
