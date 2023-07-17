class Solution {
    long power(int N, int R) {
        long modulo = (long) Math.pow(10, 9) + 7;
        long result = 1;
        
        while (R > 0) {
            if (R % 2 == 1) {
                result = (result * N) % modulo;
            }
            N = (int) (((long) N * N) % modulo);
            R /= 2;
        }
        
        return result;
    }
}
