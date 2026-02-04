1class Solution {
2    public boolean carPooling(int[][] trips, int capacity) {
3        int max = 0;
4        for(int i = 0;i<trips.length;i++){
5            if(trips[i][2]>max){
6                max = trips[i][2];
7            }
8        }
9        int ans[] = new int[max];
10        for(int i = 0;i<trips.length;i++){
11            int st = trips[i][1];
12            int ed = trips[i][2];
13            int val = trips[i][0];
14            ans[st]+=val;
15            if(ed<max){
16                ans[ed]-=val;
17            }
18        }
19        // System.out.println(Arrays.toString())
20        if(ans[0]>capacity)return false;
21        for(int i = 1;i<ans.length;i++){
22            ans[i] = ans[i]+ans[i-1];
23            if(ans[i]>capacity){
24                return false;
25            }
26        }
27        return true;
28
29    }
30}