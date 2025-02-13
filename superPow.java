class Solution {
    private static final int MOD = 1337;
    
    private int modPow(int x, int y) {
        int result = 1;
        x %= MOD;
        while (y > 0) {
            if (y % 2 == 1) {
                result = (result * x) % MOD;
            }
            x = (x * x) % MOD;
            y /= 2;
        }
        return result;
    }
    
    public int superPow(int a, int[] b) {
        a %= MOD; 
        int result = 1;
        
        for (int digit : b) {
            result = modPow(result, 10) * modPow(a, digit) % MOD;
        }
        
        return result;
    }
}