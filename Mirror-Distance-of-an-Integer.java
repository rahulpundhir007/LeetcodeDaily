1class Solution {
2    public int mirrorDistance(int n) {
3        int temp = n;
4        return Math.abs(reverse(temp)-n);
5    }
6    int reverse(int temp){
7        int res = 0;
8        while(temp!=0){
9            res = res*10+temp%10;
10            temp/=10;
11        }
12        return res;
13    }
14}