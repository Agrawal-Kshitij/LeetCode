class Solution {
    private void helper(int[][]grid , int left , int right){
        int n = grid.length;
        int m = grid[0].length;
        while(left < right){
            int leftRow = left/m;
            int leftCol = left%m;
            int rightRow = right/m;
            int rightCol = right%m;
            int temp = grid[leftRow][leftCol];
            grid[leftRow][leftCol] = grid[rightRow][rightCol];
            grid[rightRow][rightCol] = temp;
            left++;
            right--;
        }
        return;
    }
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int n = grid.length;
        int m = grid[0].length;
        k = k%(n*m);
        List<List<Integer>> answer = new ArrayList<>();
        helper(grid , 0 , n*m-k-1);
        helper(grid , n*m-k , n*m-1);
        helper(grid , 0 , n*m-1);
        for(int i = 0;i<n;i++){
            List<Integer> temp = new ArrayList<>();
            for(int j = 0;j<m;j++){
                temp.add(grid[i][j]);
            }
            answer.add(temp);
        }
        return answer;
        
        
    }
}