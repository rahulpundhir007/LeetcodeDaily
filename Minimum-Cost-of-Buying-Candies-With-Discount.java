1class Solution {
2    public int minimumCost(int[] cost) {
3        int r  = cost.length%3;
4        Arrays.sort(cost);
5        int ans = 0;
6        for(int i = 0;i<cost.length;i++){
7            if(r==0&&i%3==0){
8                continue;
9            }
10             else if(r==1&i%3==1){
11                continue;
12            }
13            else if(r==2&&i%3==2){
14                continue;
15            }
16            ans+=cost[i];
17        }
18        return ans;
19    }
20}