1class Solution {
2    public char[][] rotateTheBox(char[][] boxGrid) {
3
4        int m = boxGrid.length;
5        int n = boxGrid[0].length;
6        for (int i = 0; i < m; i++) {
7            int empty = n - 1;
8            for (int j = n - 1; j >= 0; j--) {
9                if (boxGrid[i][j] == '*') {
10                    empty = j - 1;
11                }
12                else if (boxGrid[i][j] == '#') {
13                    boxGrid[i][j] = '.';
14                    boxGrid[i][empty] = '#';
15
16                    empty--;
17                }
18            }
19        }
20        char[][] ans = new char[n][m];
21        for (int i = 0; i < m; i++) {
22            for (int j = 0; j < n; j++) {
23                ans[j][m - 1 - i] = boxGrid[i][j];
24            }
25        }
26        return ans;
27    }
28}