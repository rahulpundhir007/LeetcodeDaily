1class Solution {
2    public String reversePrefix(String s, int k) {
3        StringBuilder sb = new StringBuilder();
4        int i = k-1;
5        while(i>=0){
6          sb.append(s.charAt(i));
7          i--;
8        }
9        sb.append(s.substring(k));
10        return sb.toString();
11    }
12}