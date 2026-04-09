1class Solution {
2    public int[] singleNumber(int[] nums) {
3        HashSet<Integer> set = new HashSet<>();
4        for(int num:nums){
5            if(set.contains(num)){
6                set.remove(num);
7            }
8            else{
9                set.add(num);
10            }
11        }
12        int ans[] = new int[2];
13        int idx = 0;
14        for(int num:set){
15            ans[idx++] = num;
16        }
17        return ans;
18    }
19}