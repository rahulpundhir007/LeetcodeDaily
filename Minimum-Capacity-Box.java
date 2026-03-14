1class Solution {
2    public int minimumIndex(int[] capacity, int itemSize) {
3        int idx = -1;
4        int min = 101;
5        for(int i = 0;i<capacity.length;i++){
6            if(capacity[i]>=itemSize){
7                if(capacity[i]<min){
8                    min = capacity[i];
9                    idx = i;
10                }
11            }
12        }
13        return idx;
14    }
15}