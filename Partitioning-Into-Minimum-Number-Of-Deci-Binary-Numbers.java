1class Solution {
2    public int minPartitions(String n) {
3        int max = 0;
4        for(int i = 0;i<n.length();i++){
5            max = Math.max(max,n.charAt(i)-'0');
6        }
7        return max;
8    }
9}
10   