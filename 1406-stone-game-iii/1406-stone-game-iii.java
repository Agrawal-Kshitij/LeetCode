class Solution {
    private int helper(int i , int[]stoneValue , int[]dp){
        int n = stoneValue.length;
        if(i >= stoneValue.length)return 0;
        if(dp[i] != -1)return dp[i];
        int one = stoneValue[i]-helper(i+1 , stoneValue , dp);
        int two = Integer.MIN_VALUE;
        if(i+1 < n)two = stoneValue[i]+stoneValue[i+1]-helper(i+2 , stoneValue , dp);
        int three = Integer.MIN_VALUE;
        if(i+2 < n)three = stoneValue[i]+stoneValue[i+1]+stoneValue[i+2]-helper(i+3 , stoneValue , dp);
        return dp[i] = Math.max(one , Math.max(two , three));
    }
    public String stoneGameIII(int[] stoneValue) {
        int n = stoneValue.length;
        int[]dp = new int[n+1];
        // Arrays.fill(dp , -1);
        // int A = helper(0 , stoneValue , dp);
        for(int i = n-1;i>=0;i--){
            int one = stoneValue[i]-dp[i+1];
            int two = Integer.MIN_VALUE;
            int three = Integer.MIN_VALUE;
            if(i+1 < n)two = stoneValue[i]+stoneValue[i+1]-dp[i+2];
            if(i+2 < n)three = stoneValue[i]+stoneValue[i+1]+stoneValue[i+2]-dp[i+3];
            dp[i] = Math.max(one , Math.max(two , three));
        }
        int A = dp[0];
        if(A > 0)return "Alice";
        if(A < 0)return "Bob";
        return "Tie";
        
    }
}