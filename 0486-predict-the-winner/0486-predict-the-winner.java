class Solution {
    private boolean helper(int[]nums , int index1 , int index2 , boolean chance , int scoreA , int scoreB){
        if(index1 > index2){
            return scoreA>=scoreB;
        }
        if(chance == true){
            boolean ans1 = helper(nums , index1+1 , index2 , false , scoreA+nums[index1] , scoreB);
            boolean ans2 = helper(nums , index1 , index2-1 , false , scoreA+nums[index2] , scoreB);
            return ans1||ans2;
        }
        else{
            boolean ans1 = helper(nums , index1+1 , index2 , true , scoreA , scoreB+nums[index1]);
            boolean ans2 = helper(nums , index1 , index2-1 , true , scoreA , scoreB+nums[index2]);
            return ans1 && ans2;
        }
    }
    public boolean predictTheWinner(int[] nums) {
        int n = nums.length;
        return helper(nums , 0 , n-1 , true , 0 , 0);
        
    }
}