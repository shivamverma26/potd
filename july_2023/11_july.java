class Solution
{
 
    int findK(int matrix[][], int R, int C, int k)
    {
        int t = 0, r = C - 1, b = R - 1, l = 0;
        int count = 0;

        while (t <= b && l <= r) {
            for (int i = l; i <= r; i++) {
                count++;
                if (count == k) 
                    return matrix[t][i];
               }
                  t++;

            for (int j = t; j <= b; j++) {
                count++;
                if (count == k) 
                    return matrix[j][r];
            }
                    r--;

            if (t <= b) {
                for (int m = r; m >= l; m--) {
                    count++;
                    if (count == k) 
                        return matrix[b][m];
                }
                    b--;
            }

            if (l <= r) {
                for (int n = b; n >= t; n--) {
                    count++;
                    if (count == k) 
                        return matrix[n][l];
              }
                       l++;
            }
        }

        return -1;
    }
}
