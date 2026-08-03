class Solution {
    private int helper(int i , int[]stoneValue , int[]dp){
        int n = stoneValue.length;
        if(i >= stoneValue.length)return 0;
        if(dp[i] != -1)return dp[i];
        int one = stoneValue[i] + Math.min(helper(i+2 , stoneValue , dp) , Math.min(helper(i+3 , stoneValue , dp) , helper(i+4 , stoneValue , dp)));
        int two = Integer.MIN_VALUE;
        int three = Integer.MIN_VALUE;
        if(i+1 < n){
            two = stoneValue[i]+stoneValue[i+1]+Math.min(helper(i+5 , stoneValue , dp) , Math.min(helper(i+3 , stoneValue , dp) , helper(i+4 , stoneValue , dp)));
        }
        if(i+2 < n){
            three = stoneValue[i]+stoneValue[i+1]+stoneValue[i+2]+Math.min(helper(i+4 , stoneValue , dp) , Math.min(helper(i+5 , stoneValue , dp) , helper(i+6 , stoneValue , dp)));
        }
        return dp[i] = Math.max(one , Math.max(two , three));
    }
    public String stoneGameIII(int[] stoneValue) {
        int n = stoneValue.length;
        int[]dp = new int[n+1];
        Arrays.fill(dp , -1);
        int A = helper(0 , stoneValue , dp);
        int sum = 0;
        for(int i = 0;i<n;i++){
            sum+=stoneValue[i];
        }
        int B = sum-A;
        if(A > B)return "Alice";
        if(A < B)return "Bob";
        return "Tie";
        
    }
}