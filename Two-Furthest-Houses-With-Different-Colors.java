1class Solution {
2    public int maxDistance(int[] colors) {
3        int max = 0;
4        for(int i = 0;i<colors.length;i++){
5            for(int j = i+1;j<colors.length;j++){
6                if(colors[i]!=colors[j]){
7                    max = Math.max(max,j-i);
8                }
9            }
10        }
11        return max;
12    }
13}