class Solution {
    private int helper(int[]nums , int i , int j){
        if(i > j)return 0;
        int one = nums[i]+Math.min(helper(nums , i+2 , j) , helper(nums , i+1 , j-1));
        int two = nums[j]+Math.min(helper(nums , i+1 , j-1) , helper(nums , i , j-2));
        return Math.max(one , two);
    }
    public boolean predictTheWinner(int[] nums) {
        int n = nums.length;
        int A = helper(nums , 0 , n-1);
        int sum = 0;
        for(int i = 0;i<n;i++){
            sum+=nums[i];
        }
        int B = sum-A;
        return A>=B;
        
    }
}