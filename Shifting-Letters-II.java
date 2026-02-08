1class Solution {
2    public String shiftingLetters(String s, int[][] shifts) {
3        int n = s.length();
4        int ans[] = new int[s.length()];
5        for(int i =0;i<shifts.length;i++){
6            int st = shifts[i][0];
7            int ed = shifts[i][1]+1;
8            int val = shifts[i][2];
9            if(val==0){
10                ans[st]  = ans[st]-1;
11                if(ed<n){
12                    ans[ed] = ans[ed]+1;
13                }
14            }
15            else{
16                 ans[st]  = ans[st]+1;
17                 if(ed<n){
18                    ans[ed] = ans[ed]-1;
19                }
20            }
21        }
22        for(int i = 1;i<ans.length;i++){
23            ans[i] += ans[i-1];
24        }
25        StringBuilder sb = new StringBuilder();
26       for( int i = 0;i<s.length();i++){
27        int c = s.charAt(i);
28        int t = ans[i]%26;
29        if((c+t)<='z'&&c+t>='a'){
30        char a = (char)(c+t);
31        sb.append(a);
32        }
33        else if(c+t>'z'){
34         int diff = c+t-122;
35         char a2 = (char)(96+diff);
36         sb.append(a2);
37        }
38        else{
39            int k =  ('a'-(c+t));
40           sb.append((char)(123-k));
41        }
42       }
43       return sb.toString();
44    }
45}