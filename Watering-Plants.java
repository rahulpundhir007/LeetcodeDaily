1class Solution {
2    public int wateringPlants(int[] plants, int capacity) {
3        int ans = 0;
4        int temp = capacity;
5        for(int i = 0;i<plants.length;i++){
6            if(plants[i]<=temp){
7                temp = temp-plants[i];
8                ans++;
9            }
10            else{
11                ans+=i;
12                temp = capacity;
13                temp = temp-plants[i];
14                ans+=i+1;
15
16            }
17        }
18        return ans;
19    }
20}