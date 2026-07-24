class Solution {
    public int uniqueXorTriplets(int[] nums) {
        int n = nums.length;
        boolean[]possibleXor = new boolean[2048];
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                possibleXor[nums[i]^nums[j]] = true;
            }
        }
        HashSet<Integer> answer = new HashSet<>();
        for(int i = 0;i<possibleXor.length;i++){
            for(int j = 0;j<n;j++){
                if(possibleXor[i] == true){
                    answer.add(i^nums[j]);
                }
                
            }
        }
        return answer.size();

        
    }
}