1class Solution {
2    public int[] findThePrefixCommonArray(int[] A, int[] B) {
3        int ans[] = new int[A.length];
4        int idx = 0;
5        int hash[] = new int[A.length+1];
6        for(int i = 0;i<A.length;i++){
7            int c = 0;
8            hash[A[i]]++;
9            hash[B[i]]++;
10            for(int num:hash){
11                if(num==2){
12                    c++;
13                }
14            }
15            ans[i] = c;
16        }
17        return ans;
18    }
19}