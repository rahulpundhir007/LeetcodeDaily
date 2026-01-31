1class Solution {
2    public int maximumGroups(int[] arr) {
3        // Arrays.sort(arr);
4        int ans = 0;
5        int group = 0;
6        for(int i = 0;i<arr.length;i++){
7            ans++;
8            if(ans>group){
9               group+=1;
10               ans = 0;
11            }
12        }
13        return group;
14        }
15}