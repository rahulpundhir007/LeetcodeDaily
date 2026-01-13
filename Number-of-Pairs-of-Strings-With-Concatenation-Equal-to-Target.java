1class Solution {
2    public int numOfPairs(String[] nums, String target) {
3        int c= 0;
4        for(int i = 0;i<nums.length;i++){
5            for(int j = 0;j<nums.length;j++){
6                if(i==j){
7                    continue;
8                }
9            if((nums[i]+nums[j]).equals(target)){
10                c++;
11            }
12            }
13        }
14        return c;
15    }
16}