1class Solution {
2    public int longestBalanced(int[] nums) {
3        int ans = 0;
4        for(int i = 0;i<nums.length-1;i++){
5            HashSet<Integer> set = new HashSet<>();
6            HashSet<Integer> set2 = new HashSet<>();
7            for(int j = i;j<nums.length;j++){
8                if(nums[j]%2==0){
9                    set.add(nums[j]);
10                }
11                else{
12                    set2.add(nums[j]);
13                }
14                if(set.size()==set2.size()){
15                 ans = Math.max(ans,j-i+1);
16                }
17            }  
18        }
19        return ans;
20    }
21}