1class Solution {
2    public int minOperations(int[][] grid, int x) {
3        int n = grid.length;
4        int m = grid[0].length;
5        
6        int arr[] = new int[n*m];
7        int idx = 0;
8        for(int i = 0;i<n;i++){
9            for(int  j = 0;j<m;j++){
10                arr[idx++] = grid[i][j];
11            }
12        }
13        int k = m*n;
14        Arrays.sort(arr);
15        int median = arr[k/2];
16        int ans = 0;
17        for(int i = 0;i<arr.length;i++){
18            if(Math.abs(arr[i]-median)%x!=0){
19                return -1;
20            }
21            else{
22                ans+=Math.abs(median-arr[i])/x;
23            }
24        }
25        return ans;
26    }
27}