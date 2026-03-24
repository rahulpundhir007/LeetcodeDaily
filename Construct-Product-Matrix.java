1class Solution {
2    public int[][] constructProductMatrix(int[][] grid) {
3       int n = grid.length;
4       int m = grid[0].length;
5       int ans[] = new int[n*m];
6       int idx = 0;
7       for(int i = 0;i<n;i++){
8        for(int j = 0;j<m;j++){
9            ans[idx++] = grid[i][j]%12345;
10        }
11       }
12       int prefix[] = new int[n*m];
13       prefix[0] = 1;
14       for(int i = 1;i<prefix.length;i++){
15        prefix[i] = (prefix[i-1]*ans[i-1])%12345;
16       }
17       
18       int r = 1;
19       for(int i = ans.length-1;i>=0;i--){
20        prefix[i] = (r*prefix[i])%12345;
21        r = (r*ans[i])%12345;
22       }
23       idx = 0;
24       for(int i = 0;i<grid.length;i++){
25        for(int j = 0;j<grid[0].length;j++){
26           grid[i][j] = prefix[idx++];
27        }
28       }
29       
30       return grid;
31
32    }
33}