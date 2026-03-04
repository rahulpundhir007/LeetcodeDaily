1class Solution {
2    public int numSpecial(int[][] mat) {
3        int c = 0;
4        for (int i = 0; i < mat.length; i++) {
5            for (int j = 0; j < mat[0].length; j++) {
6                if (mat[i][j] == 1) {
7                    boolean check = true;
8                    for (int m = 0; m < mat[0].length; m++) {
9                        if (mat[i][m] == 1 && j != m) {
10                            check = false;
11                            break;
12                        }
13                    }
14                    if (check) {
15                        for (int n = 0; n < mat.length; n++) {
16                            if (mat[n][j] == 1 && i != n) {
17                                check = false;
18                                break;
19                            }
20                        }
21                    }
22
23                    if (check) {
24                        c++;
25                    }
26                }
27            }
28        }
29        return c;
30    }
31}