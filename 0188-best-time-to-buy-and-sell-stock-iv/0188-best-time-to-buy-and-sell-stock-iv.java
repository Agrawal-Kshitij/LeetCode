class Solution {
    public int maxProfit(int t, int[] prices) {
         int n = prices.length;
        int[][][]dp = new int[n+1][2][t+1];
        for(int i = n-1;i>=0;i--){
            for(int j = 0;j<2;j++){
                for(int k = t-1;k>=0;k--){
                    int one = 0;
                    int two = 0;
                    if(j == 0){
                        one = dp[i+1][1][k]-prices[i];
                        two = dp[i+1][0][k];
                    }
                    if(j == 1){
                        one = dp[i+1][0][k+1]+prices[i];
                        two = dp[i+1][j][k];
                    }
                    dp[i][j][k] = Math.max(one , two);
                } 
            }
        }
        return dp[0][0][0];
    }
}