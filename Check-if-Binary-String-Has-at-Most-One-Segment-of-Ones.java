1class Solution {
2    public boolean checkOnesSegment(String s) {
3        if(s.length()==1){
4            return true;
5        }
6        int idx = 0;
7       for(int i = 1;i<s.length();i++){
8          if(s.charAt(i)=='0'){
9            idx = i;
10            break;
11          }
12       }
13       if(idx==0){
14        return true;
15       }
16       for(int i = idx;i<s.length();i++){
17            if(s.charAt(i)=='1'){
18                return false;
19            }
20       }
21        return true;
22    }
23}