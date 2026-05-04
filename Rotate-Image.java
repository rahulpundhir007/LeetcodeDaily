1class Solution {
2    public void rotate(int[][] matrix) {
3        int n = matrix.length;
4        int m = matrix[0].length;
5        for(int i = 0;i<n;i++){
6            for(int j = i+1;j<m;j++){
7                int temp = matrix[i][j];
8                matrix[i][j]= matrix[j][i];
9                matrix[j][i] = temp;
10            }
11        }
12       for (int i = 0; i < n; i++) {
13            int left = 0, right = n - 1;
14            while (left < right) {
15                int temp = matrix[i][left];
16                matrix[i][left] = matrix[i][right];
17                matrix[i][right] = temp;
18                left++;
19                right--;
20            }
21       }
22        }
23    }