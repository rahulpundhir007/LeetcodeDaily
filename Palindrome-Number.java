1class Solution {
2    public boolean isPalindrome(int x) {
3        int temp = x;
4        int rev = 0;
5        while(x>0){
6           int r = x%10;
7            rev = r + rev*10;
8            x/=10;
9        }
10        if(rev ==temp){
11            return true;
12        }
13        else{
14            return false;
15        }
16    }
17}