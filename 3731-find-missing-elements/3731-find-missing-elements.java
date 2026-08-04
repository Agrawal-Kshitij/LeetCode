class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int n = nums.length;
        int[]hash = new int[101];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<n;i++){
            min = Math.min(min , nums[i]);
            max = Math.max(max , nums[i]);
            hash[nums[i]]++;
        }
        List<Integer> answer = new ArrayList<>();
        for(int i = min+1;i<max;i++){
            if(hash[i] == 0)answer.add(i);
        }
        return answer;

        
    }
}