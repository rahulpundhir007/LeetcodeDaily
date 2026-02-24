1class Solution {
2    public List<Integer> findDisappearedNumbers(int[] nums) {
3        List<Integer> ans = new ArrayList<>();
4        int freq []= new int[nums.length+1];
5        for(int num:nums){
6            freq[num]++;
7        }
8        for(int i = 1;i<freq.length;i++){
9            if(freq[i]==0){
10                ans.add(i);
11            }
12        }
13        return ans;
14
15    }
16}