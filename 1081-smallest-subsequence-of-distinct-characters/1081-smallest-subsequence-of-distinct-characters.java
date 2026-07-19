class Solution {
    public String smallestSubsequence(String s) {
        int n = s.length();
        int[]lastOccurence = new int[26];
        for(int i = 0;i<n;i++){
            char curr = s.charAt(i);
            int idx = curr-'a';
            lastOccurence[idx]=i;
        }
        boolean[]haveTaken = new boolean[26];
        Stack<Character> st = new Stack<>();
        for(int i = 0;i<n;i++){
            char curr = s.charAt(i);
            int idx = curr-'a';
            if(haveTaken[idx] == true)continue;
            while(!st.isEmpty() && st.peek()-'a' > idx){
                if(lastOccurence[st.peek()-'a'] > i){
                    haveTaken[st.peek()-'a']=false;
                    st.pop();
                }
                else{
                    break;
                }
            }
            if(haveTaken[idx] == false){
                st.push(curr);
                haveTaken[idx] = true;
            }
        }
        StringBuilder sb = new StringBuilder();

        for (char ch : st) {
            sb.append(ch);
        }
        return sb.toString();
        
    }
}