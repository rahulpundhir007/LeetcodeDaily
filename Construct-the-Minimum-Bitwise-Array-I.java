1class Solution {
2    public int[] minBitwiseArray(List<Integer> nums) {
3        int ans[] = new int[nums.size()];
4        int idx = 0;
5        for(int i = 0;i<nums.size();i++){
6            for(int j = 1;j<=nums.get(i);j++){
7                if((j|(j+1))==nums.get(i)){
8                    ans[i] = j;
9                    break;
10                }
11            }
12            if(ans[i]==0){
13                ans[i] = -1;
14            }
15        }
16        return ans;
17    }
18}