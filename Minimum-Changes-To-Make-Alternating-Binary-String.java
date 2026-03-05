1class Solution {
2    public int minOperations(String s) {
3        int pattern1 = 0; // starting with 0 -> 0101...
4        int pattern2 = 0; // starting with 1 -> 1010...
5
6        for(int i = 0; i < s.length(); i++) {
7            char c = s.charAt(i);
8
9            // pattern 0101...
10            if(i % 2 == 0) {
11                if(c != '0') pattern1++;
12            } else {
13                if(c != '1') pattern1++;
14            }
15
16            // pattern 1010...
17            if(i % 2 == 0) {
18                if(c != '1') pattern2++;
19            } else {
20                if(c != '0') pattern2++;
21            }
22        }
23
24        return Math.min(pattern1, pattern2);
25    }
26}