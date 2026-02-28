1class Solution {
2    public int[] minDistinctFreqPair(int[] nums) {
3        int ans[] = new int[2];
4        int hash[] = new int[101];
5        ans[0] = -1;
6        ans[1] = -1;
7        for(int num:nums){
8            hash[num]++;
9        }
10        int f = 0;
11        for(int i = 1;i<101;i++){
12            if(hash[i]>0){
13                ans[0] = i;
14                f = hash[i];
15                break;
16            }
17        }
18        for(int i = 1;i<101;i++){
19            if(hash[i]>0&&hash[i]!=f&&i>ans[0]){
20                ans[1] = i;
21                return ans;
22            }
23        }
24        if(ans[1]==-1){
25            return new int[]{-1,-1};
26        }
27return ans;
28    }
29}