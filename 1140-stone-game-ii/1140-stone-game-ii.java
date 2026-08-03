class Solution {
    private int helper(int[]piles , int index , int M , int[][]dp){
        int n = piles.length;
        if(index >= n){
            return 0;
        }
        if(dp[index][M] != -1)return dp[index][M];
        int score = Integer.MIN_VALUE;
        for(int i = 1 ; i <= Math.min(2*M , n-index) ; i++){
            if(index - 1 < 0)score = Math.max(score , piles[index+i-1] - helper(piles , index+i , Math.max(M , i) , dp));
            else{
                score = Math.max(score , piles[index+i-1]-piles[index-1] - helper(piles , index+i , Math.max(M , i) , dp));
            }
        }
        return dp[index][M] = score;
        
    }
    public int stoneGameII(int[] piles) {
        int n = piles.length;
        for(int i = 1;i<n;i++){
            piles[i] = piles[i]+piles[i-1];
        }
        int[][]dp = new int[n][n+1];
        for(int i = 0;i<n;i++){
            Arrays.fill(dp[i] , -1);
        }
        int x = helper(piles , 0 , 1 , dp);
        int y = piles[n-1];

        int a = (x + y) / 2;
        int b = (y - x) / 2;
        return a;
        
    }
}