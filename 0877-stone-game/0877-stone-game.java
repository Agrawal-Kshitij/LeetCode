class Solution {
    private int helper(int[]nums , int i , int j , int[][]dp){
        if(i > j)return 0;
        if(dp[i][j] != -1)return dp[i][j];
        int one = nums[i]-helper(nums , i+1 , j , dp);
        int two = nums[j]-helper(nums , i , j-1 , dp);
        return dp[i][j] = Math.max(one , two);
    }
    public boolean stoneGame(int[] piles) {
        int n = piles.length;
        int[][]dp = new int[n+1][n+1];
        for(int i = 0;i<=n;i++){
            Arrays.fill(dp[i] , -1);
        }
        int A = helper(piles , 0 , piles.length-1 , dp);
        return A >= 0;
        
    }
}