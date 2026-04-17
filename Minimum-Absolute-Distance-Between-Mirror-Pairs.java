1class Solution {
2    public int minMirrorPairDistance(int[] nums) {
3        int ans = Integer.MAX_VALUE;
4        HashMap<Integer,Integer> map = new HashMap<>();
5        for(int i = 0;i<nums.length;i++){
6            int t = check(nums[i]);
7            if(map.containsKey(nums[i])){
8                ans = Math.min(ans,i-map.get(nums[i]));
9            }
10            map.put(t,i);
11        }
12        System.out.println(map);
13        return ans==Integer.MAX_VALUE?-1:ans;
14
15    }
16    public int check(int num){
17        int rev = 0;
18        while(num!=0){
19            int r = num%10;
20            rev = rev*10+r;
21            num/=10;
22        }
23        return rev;
24    }
25}