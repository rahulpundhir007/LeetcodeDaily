1class Solution {
2    public boolean checkZeroOnes(String s) {
3        int max1 = 0;
4        int max2 = 0;
5        int c1 = 0;
6        int c2 = 0;
7        for(int i = 0;i<s.length();i++){
8            if(s.charAt(i)=='1'){
9                c1++;
10                max1 = Math.max(max1,c1);
11                c2 = 0;
12            }
13            else{
14               c1= 0;
15               c2++;
16               max2 = Math.max(max2,c2);
17            }
18        }
19return max1>max2;
20    }
21}