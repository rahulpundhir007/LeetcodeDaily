1class Solution {
2    public int minimumRefill(int[] plants, int capacityA, int capacityB) {
3        int i = 0;
4        int j = plants.length-1;
5        int ans = 0;
6        int temp1 = capacityA;
7        int temp2 = capacityB;
8        while(i<=j){
9            if(i==j){
10                int max = Math.max(temp1,temp2);
11                if(plants[i]>max){
12                    ans++;
13                }
14                break;
15            }
16            if(plants[i]<=temp1){
17                temp1-=plants[i];
18            }
19            else{
20                ans++;
21                temp1 = capacityA;
22                temp1-=plants[i];
23            }
24            if(plants[j]<=temp2){
25                temp2-=plants[j];
26            }
27            else{
28                ans++;
29                temp2 = capacityB;
30                temp2 = temp2-plants[j];
31                }
32            
33            i++;j--;
34        }
35return ans;
36    }
37}