1class Solution {
2    public int[] rotateElements(int[] nums, int k) {
3        int cnt = 0;
4        for(int i:nums){
5            if(i>-1){
6                cnt++;
7            }
8        }
9        int ans[] = new int[cnt];
10        int idx = 0;
11        for(int i:nums){
12            if(i>-1){
13               ans[idx++] = i;
14            }
15        }
16       if(ans.length==0){
17        return nums;
18       }
19       k = k%ans.length;
20        rev(ans,0,k-1);
21        rev(ans,k,ans.length-1);
22        rev(ans,0,ans.length-1);
23        idx = 0;
24        for(int i = 0;i<nums.length;i++){
25            if(nums[i]>-1){
26                nums[i] = ans[idx++];
27            }
28        }
29        return nums;
30    }
31    public void rev(int[] ans,int st,int ed){
32        while(st<ed){
33            int temp = ans[st];
34            ans[st] = ans[ed];
35            ans[ed] = temp;
36            st++;
37            ed--;
38        }
39    }
40
41}