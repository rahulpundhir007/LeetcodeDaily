1class Solution {
2    public int minTimeToVisitAllPoints(int[][] arr) {
3        int time = 0;
4        for(int i = 0;i<arr.length-1;i++){
5           int x1 = Math.abs(arr[i][0]-arr[i+1][0]);
6           int y1 = Math.abs(arr[i][1]-arr[i+1][1]);
7
8            time+= Math.max(x1,y1);
9        }
10        return time;
11    }
12}
13
14       