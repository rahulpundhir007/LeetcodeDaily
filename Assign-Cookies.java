1class Solution {
2    public int findContentChildren(int[] g, int[] s) {
3    int min = Math.min(g.length,s.length);
4    Arrays.sort(g);
5    Arrays.sort(s);  
6    int c = 0;
7    int j = 0;
8    for(int i = 0;i<s.length;i++){
9        if(j<g.length&&g[j]<=s[i]){
10            c++;
11            j++;
12        }
13
14    }
15    return c;
16
17    }
18}