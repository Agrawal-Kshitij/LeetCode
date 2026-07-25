class Solution {
    public int maxProduct(int n) {
        int max = -1;
        int secMax = -1;
        while(n != 0){
            int last = n%10;
            if(last >= max){
                secMax = max;
                max = last;
            }
            else if(last > secMax){
                secMax = last;
            }
            n/=10;
        }
        return max*secMax;
        
    }
}