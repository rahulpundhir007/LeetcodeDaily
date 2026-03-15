1class Solution {
2    public int firstUniqueEven(int[] nums) {
3        int has[] = new int[101];
4        for(int num:nums){
5        has[num]++;
6        }
7        for(int num:nums){
8            if((num&1)==0&&has[num]==1){
9                return num;
10            }
11        }
12        return -1;
13    }
14}