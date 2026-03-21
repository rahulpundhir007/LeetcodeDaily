1class Solution {
2    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
3        rev(grid,x,y,k);
4        return grid;
5    }
6    void rev(int[][] grid, int x, int y, int k){
7        int st = x;
8        int ed = x+k-1;
9        while(st<ed){
10        for(int i = y;i<y+k;i++){
11            int  temp = grid[st][i];
12            grid[st][i] = grid[ed][i];
13            grid[ed][i] = temp;
14        }
15        st++;
16        ed--;
17        }
18    }
19}