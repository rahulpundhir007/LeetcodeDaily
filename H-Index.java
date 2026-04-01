1class Solution {
2    public int hIndex(int[] citations) {
3        int ans = 0;
4       int idx = 0;
5       
6        for(int i = 0;i<=citations.length;i++){
7            int count = 0;
8            for(int j = 0;j<citations.length;j++){
9                if(citations[j]>=idx){
10                    count++;
11                }
12            }
13            if(count>=idx){
14            ans = idx;
15            }
16            else{
17                break;
18            }
19            idx++;
20        }
21        return ans;
22        
23    }
24}