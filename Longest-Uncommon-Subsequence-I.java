1class Solution {
2    public int findLUSlength(String a, String b) {
3if(a.equals(b)){
4    return -1;
5}
6return Math.max(a.length(),b.length());
7
8    }
9}