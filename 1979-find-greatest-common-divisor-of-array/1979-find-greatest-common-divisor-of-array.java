class Solution {
    private int gcd(int a , int b){
        if(b == 0)return a;
        return gcd(b , a%b);
    }
    public int findGCD(int[] nums) {
        int n = nums.length;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<n;i++){
            min = Math.min(min , nums[i]);
            max = Math.max(max , nums[i]);
        }
        return gcd(max , min);
        
    }
}