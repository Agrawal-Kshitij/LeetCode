class Solution {
    public String smallestPalindrome(String s) {
        int n = s.length();
        if(n <= 2)return s;
        int[]hash = new int[26];
        int half = n/2 - 1;
        for(int i = 0;i<=half;i++){
            char currChar = s.charAt(i);
            int index = currChar-'a';
            hash[index]++;
        }
        StringBuilder str = new StringBuilder();
        for(int i = 0;i<26;i++){
            char currChar = (char)('a'+i);
            while(hash[i] != 0){
                str.append(currChar);
                hash[i]--;
            }
        }
        if(n % 2 == 0){
            str.append(new StringBuilder(str).reverse());
        }
        else{
            str.append(s.charAt(half+1));
            for(int i =  str.length()-2;i>=0;i--){
                char currChar = str.charAt(i);
                str.append(currChar);
            }
        }
        return str.toString();

        
    }
}