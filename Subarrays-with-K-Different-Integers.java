1class Solution {
2    public int subarraysWithKDistinct(int[] nums, int k) {
3        int c1 = count(nums,k);
4        System.out.println(c1);
5        int c2 = count(nums,k-1);
6        System.out.println(c2);
7        return c1-c2;
8    }
9    private int count(int nums[],int k){
10         HashMap<Integer,Integer> map = new HashMap<>();
11        int c = 0;
12        int left = 0;
13        for(int i = 0;i<nums.length;i++){
14            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
15            while(map.size()>k){
16                map.put(nums[left],map.getOrDefault(nums[left],0)-1);
17                if(map.get(nums[left])==0){
18                    map.remove(nums[left]);
19                }
20                left++;  
21            }
22            c = c+i-left+1;
23        }
24
25   return c;
26    }
27}