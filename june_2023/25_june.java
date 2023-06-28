class GfG
{
    public static ArrayList<ArrayList<Integer>> uniqueRow(int a[][],int r, int c)
    {
        //add code here.
         boolean[] vis = new boolean[r];
        ArrayList<ArrayList<Integer>> out = new ArrayList<>();
        
        for (int i = 0; i < r; ++i) {
            if (vis[i])
                continue;
            
            vis[i] = true;
            ArrayList<Integer> binArr = new ArrayList<>();
            for (int j = 0; j < c; ++j) {
                binArr.add(a[i][j]);
            }
            out.add(binArr);
            
            for (int j = i + 1; j < r; ++j) {
                boolean isEqual = true;
                for (int k = 0; k < c; ++k) {
                    if (a[i][k] != a[j][k]) {
                        isEqual = false;
                        break;
                    }
                }
                vis[j] = isEqual || vis[j];
            }
        }
        
        return out;
        
    }
}
