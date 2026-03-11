1class Solution {
2    public int findComplement(int n) {
3         if(n==0){
4            return 1;
5        }
6        int c= 0;
7        int ans =0;
8       while(n!=0){
9        int r = n%2;
10        if(r==0){
11                ans = ans+ (1<<c);
12            }
13            c++;
14        n/=2;
15       }
16        return ans;
17    }
18}