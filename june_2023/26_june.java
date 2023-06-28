class Solution {
    static int MOD = 1000000007;

    int modInverse(int num) {
        int y = 0, x = 1;
        int mod = MOD;

        while (num > 1) {
            int quo = num / mod;
            int t = mod;

            mod = num % mod;
            num = t;
            t = y;

            y = x - quo * y;
            x = t;
        }

        if (x < 0)
            x += MOD;

        return x;
    }

    long modMultiply(int a, int b) {
        a %= MOD;
        b %= MOD;
        return ((long) a * b) % MOD;
    }

    int nCr(int n, int r) {
        if (n < r)
            return 0;

        int a = Math.min(n - r, r);
        int b = Math.max(n - r, r);

        int ans = 1;
        for (int i = n; i > b; --i)
            ans = (int) modMultiply(ans, i);

        for (int i = 2; i <= a; ++i)
            ans = (int) modMultiply(ans, modInverse(i));

        return ans;
    }
}
