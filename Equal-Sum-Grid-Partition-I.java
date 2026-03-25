1class Solution {
2    public boolean canPartitionGrid(int[][] grid) {
3        int n = grid.length;
4        int m= grid[0].length;
5        long sum = 0;
6        for(int i = 0;i<n;i++){
7            for(int j = 0;j<m;j++){
8                sum+=grid[i][j];
9            }
10        }
11        if(sum%2!=0){
12            return false;
13        }
14        long sum2 = 0;
15        for(int i = 0;i<n;i++){
16            for(int j = 0;j<m;j++){
17                sum2+=grid[i][j];
18            }
19            if(sum/2==sum2){
20                return true;
21            }
22        }
23        sum2 = 0;
24        for(int i = 0;i<m;i++){
25            for(int j = 0;j<n;j++){
26                sum2+=grid[j][i];
27            }
28            if(sum/2==sum2){
29                return true;
30            }
31        }
32        return false;
33    }
34}