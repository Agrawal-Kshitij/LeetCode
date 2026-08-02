class Solution {
    // private int helper(int[]piles , int index1 , int index2 , boolean chance){
    //     if(index1 > index2){
    //         if(scoreA > scoreB)return 0;
    //         return -1;
    //     }
    //     if(chance == true){
    //         int ans1 = helper(piles , index1+1 , index2 , false);
    //         int ans2 = helper(piles , index1 , index2-1 , false);
    //         if(ans1 == -1 && ans2 == -1)return -1;
    //         if(ans1 != -1)return ans1+piles[index1];
    //         return ans2+piles[index2];
    //     }
    //     int ans1 = helper(piles , index1+1 , index2 , true);
    //     int ans2 = helper(piles , index1 , index2-1 , true);
    //     if(ans1 != -1 && ans2 != -1){

    //     }
    //     return -1;
    // }
    public boolean stoneGame(int[] piles) {
        int n = piles.length;
        return true;
        //return helper(piles , 0 , piles.length-1 , true);
        
    }
}