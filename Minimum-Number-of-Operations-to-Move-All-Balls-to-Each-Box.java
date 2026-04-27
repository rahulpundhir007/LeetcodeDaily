1class Solution {
2    public int[] minOperations(String boxes) {
3        int n = boxes.length();
4        int[] res = new int[n];
5        int balls = 0, moves = 0;
6        for (int i = 0; i < n; i++) {
7            res[i] = balls + moves;
8            moves += balls;
9            balls += boxes.charAt(i)-'0';
10        }
11        balls = moves = 0;
12        for (int i = n - 1; i >= 0; i--) {
13            res[i] += balls + moves;
14            moves += balls;
15            balls += boxes.charAt(i)-'0';
16        }
17        return res;
18    }
19}