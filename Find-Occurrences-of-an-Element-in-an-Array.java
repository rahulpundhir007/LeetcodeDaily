1class Solution {
2    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
3        int ans[] = new int[queries.length];
4        int c = 0;
5        HashMap<Integer,Integer> map = new HashMap<>();
6        for(int i = 0;i<nums.length;i++){
7            if(nums[i]==x){
8                c++;
9                map.put(c,i);
10            }
11        }
12        for(int i = 0;i<queries.length;i++){
13            if(queries[i]>c){
14                ans[i] = -1;
15            }
16            else{
17                ans[i] = map.get(queries[i]);
18            }
19        }
20        return ans;
21    }
22}