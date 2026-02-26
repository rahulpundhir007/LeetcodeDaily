1class Solution {
2    int c = 0;
3    void fun(int ans[], int idx){
4        int id = idx-1;
5        ans[idx] = 0;
6        while(id>0&&ans[id]==1){
7            ans[id] = 0;
8            id--;
9        }
10        ans[id] = 1;
11
12    }
13    public int numSteps(String s) {
14         char ch[] = s.toCharArray();
15         int ans[] = new int[ch.length+1];
16
17         for(int i =ch.length-1;i>=0;i--){
18              ans[i+1] = ch[i]-'0';
19         } 
20         int idx = ans.length-1;
21         int c = 0;
22        while(idx>0){
23              if(idx==0||idx==1&& ans[0]==0){
24                return c;
25              }
26              if(ans[idx]==1){
27                fun(ans,idx);
28              }
29              else{
30                idx--;
31              }
32                c++;
33        }
34         
35        return c;
36    }
37}