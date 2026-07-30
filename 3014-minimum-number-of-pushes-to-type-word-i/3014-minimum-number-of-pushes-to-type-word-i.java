class Solution {
    public int minimumPushes(String word) {
        int n = word.length();
        int cnt = 0;
        int answer = 0;
        int curr = 1;
        for(int i = 0;i<n;i++){
            if(cnt < 8){
                answer+=curr;
                cnt++;
            }
            if(cnt == 8){
                curr++;
                cnt = 0;
            }
        }
        return answer;
    }
}