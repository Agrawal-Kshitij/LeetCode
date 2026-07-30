class Solution {
    public int minimumPushes(String word) {
        int n = word.length();
        return 4*(n/8)*(n/8+1) + (n%8)*(n/8+1);
    }
}