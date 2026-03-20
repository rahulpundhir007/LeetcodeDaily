1class Solution {
2    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
3        List<Integer> ans = new ArrayList<>();
4        int hash[] = new int[101];
5        for(int num:bulbs){
6            hash[num]++;
7        }
8       
9        for(int i = 0;i<hash.length;i++){
10            if(hash[i]%2!=0){
11                ans.add(i);
12            }
13        }
14        return ans;
15    }
16}