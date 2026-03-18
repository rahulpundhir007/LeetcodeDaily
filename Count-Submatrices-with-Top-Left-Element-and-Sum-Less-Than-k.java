1class Solution {
2    public int countSubmatrices(int[][] grid, int k) {
3        int n= grid.length;
4        int m = grid[0].length;
5        int ans[][] = new int[n][m];
6         int c = 0;
7        ans[0][0] = grid[0][0];
8        if(ans[0][0]<=k) c++;
9        for(int i = 1;i<m;i++){
10            ans[0][i] = ans[0][i-1]+grid[0][i];
11            if(ans[0][i]<=k){
12                    c++;
13                }
14        }
15        for(int i = 0;i<n;i++){
16            if(i==0){
17                continue;
18            }
19            ans[i][0] =ans[i-1][0] +grid[i][0];
20            if(ans[i][0]<=k){
21                    c++;
22                }
23        }
24        for(int i = 1;i<n;i++){
25            for(int j = 1;j<m;j++){
26                ans[i][j] = ans[i-1][j]+ans[i][j-1]+grid[i][j]-ans[i-1][j-1];
27                if(ans[i][j]<=k){
28                    c++;
29                }
30            }
31        }
32        return c;
33    }
34}