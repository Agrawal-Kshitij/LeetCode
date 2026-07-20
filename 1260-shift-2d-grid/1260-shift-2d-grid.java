class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int n = grid.length;
        int m = grid[0].length;
        k = k%(n*m);
        List<List<Integer>> answer = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        for(int i = 0;i<k;i++){
            int idx = n*m-k+i;
            int currCol = idx%m;
            int currRow = idx/m;
            temp.add(grid[currRow][currCol]);
            if(temp.size() == m){
                answer.add(temp);
                temp = new ArrayList<>();
            }
        }
        for(int i = 0;i<n*m-k;i++){
            int currCol = i%m;
            int currRow = i/m;
            int num = grid[currRow][currCol];
            temp.add(num);
            if(temp.size() == m){
                answer.add(temp);
                temp = new ArrayList<>();
            }

        }
        return answer;
        
        
    }
}