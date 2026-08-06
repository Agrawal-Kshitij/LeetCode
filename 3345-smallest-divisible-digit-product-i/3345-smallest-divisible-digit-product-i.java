class Solution {
    private boolean product(int n , int t){
        int mul = 1;
        while(n != 0){
            int last = n%10;
            mul*=last;
            n = n/10;
        }
        if(mul % t == 0)return true;
        return false;
    }
    public int smallestNumber(int n, int t) {
        int answer = n;
        for(int i = n;i<=n+10;i++){
            if(product(i , t) == true){
                answer = i;
                break;
            }
        }
        return answer;
        
    }
}