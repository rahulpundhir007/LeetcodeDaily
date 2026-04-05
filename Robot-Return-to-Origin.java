1class Solution {
2    public boolean judgeCircle(String moves) {
3        int ans = 0;
4        int ans2 = 0;
5        for(int i  = 0;i<moves.length();i++){
6            if(moves.charAt(i)=='U'){
7                ans++;
8            }
9            else if(moves.charAt(i)=='D'){
10                ans--;
11            }
12            else if(moves.charAt(i)=='L'){
13                ans2++;
14            }
15            else{
16                ans2--;
17            }
18        }
19        return (ans==ans2)&&ans==0;
20    }
21}