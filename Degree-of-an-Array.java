1class Solution {
2    public int findShortestSubArray(int[] nums) {
3        HashMap<Integer,Integer> map = new HashMap<>();
4        for(int num:nums){
5            map.put(num,map.getOrDefault(num,0)+1);
6        }
7        int max = 0;
8        for(Integer e:map.keySet()){
9            max = Math.max(map.get(e),max);
10        }
11        HashMap<Integer,Integer> map2 = new HashMap<>();
12        HashMap<Integer,Integer> map3 = new HashMap<>();
13        for(int i= 0;i<nums.length;i++){
14            if(!map2.containsKey(nums[i])){
15                map2.put(nums[i],i);
16            }
17        }
18        for(int i= 0;i<nums.length;i++){
19                map3.put(nums[i],i);
20        }
21        int min = nums.length;
22        for(Integer e: map.keySet()){
23            if(map.get(e)==max){
24                min = Math.min(min,map3.get(e)-map2.get(e)+1);
25            }
26        }
27        return min;
28    }
29}