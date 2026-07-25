class Solution {
    private int helper(int[]prices , int index , int buy , int k , int[][][]dp){
        int n = prices.length;
        if(index == n){
            return 0;
        }
        if(k == 2){
            return 0;
        }
        if(dp[index][buy][k] != -1)return dp[index][buy][k];
        int one = 0;
        int two = 0;
        if(buy == 0){
            one = helper(prices , index+1 , 1 , k , dp)-prices[index];
            two = helper(prices , index+1 , 0 , k , dp);
        }
        if(buy == 1){
            one = helper(prices , index+1 , 0 , k+1 , dp)+prices[index];
            two = helper(prices , index+1 , buy , k , dp);
        }
        return dp[index][buy][k] = Math.max(one , two);
    }
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int[][][]dp = new int[n+1][2][3];
        // for(int i = 0;i<n;i++){
        //     for(int j = 0;j<2;j++){
        //         Arrays.fill(dp[i][j] , -1);
        //     }
        // }
        for(int i = n-1;i>=0;i--){
            for(int j = 0;j<2;j++){
                for(int k = 1;k>=0;k--){
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

        //return helper(prices , 0 , 0 , 0 , dp);

        
    }
}