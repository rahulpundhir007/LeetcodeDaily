1class Solution {
2    public int closestTarget(String[] words, String target, int startIndex) {
3        int ans = words.length;
4        int n = words.length;
5
6        for (int i = 0; i < n; ++i) {
7            if (words[i].equals(target)) {
8                int dist = Math.abs(i - startIndex);
9                ans = Math.min(ans, Math.min(dist,n-dist));
10            }
11        }
12        if(ans==words.length){
13            return -1;
14        }
15        return ans;
16    }
17}