//Leetcode -807: Max Increase to Keep City Skyline
//Time Complexity: O(m*n)
class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int n = grid.length;
        int rmax[] = new int[n];
        int cmax[] = new int[n];
        for(int i = 0;i<n;i++){
            int max = 0;
            for(int j = 0;j<n;j++){
              if(grid[i][j]>max){
                max = grid[i][j];
              }
            }
            rmax[i] = max;
        }
        for(int i = 0;i<n;i++){
            int max = 0;
            for(int j = 0;j<n;j++){
              if(grid[j][i]>max){
                max = grid[j][i];
              }
            }
            cmax[i] = max;
        }
        int sum = 0;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
              sum+=Math.min(rmax[i],cmax[j])-grid[i][j];
            }
           
        }
        return sum;

    }
}
