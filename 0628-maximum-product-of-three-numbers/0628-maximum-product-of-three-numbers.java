class Solution {
    public int maximumProduct(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int one = nums[0]*nums[1]*nums[2];
        int two = nums[n-1]*nums[n-2]*nums[n-3];
        int three = nums[0]*nums[1]*nums[n-1];
        return Math.max(one , Math.max(two , three));
        
    }
}