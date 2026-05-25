1class Solution {
2    public int[] countOppositeParity(int[] nums) {
3        int ans[] = new int[nums.length];
4        for(int i = 0;i<nums.length;i++){
5            int c = 0;
6          for(int j = i+1;j<nums.length;j++){
7            if(nums[i]%2!=0&&nums[j]%2==0){
8                c++;
9            }
10            else if(nums[i]%2==0&&nums[j]%2!=0){
11                c++;
12
13            }
14          }
15          ans[i] = c;
16        }
17        return ans;
18    }
19}