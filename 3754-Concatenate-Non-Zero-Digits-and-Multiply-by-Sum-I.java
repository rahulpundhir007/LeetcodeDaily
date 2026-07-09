class Solution {
    public long sumAndMultiply(int n) {
        long rev = 0;
        long ans = 0;
        int sum = 0;
        while(n!=0){
            if(n%10!=0){
            sum+=n%10;
            rev = rev*10+n%10;
            }
            n/=10;
        }
        while(rev!=0){
            ans = ans*10 + rev%10;
            rev/=10;
        }
        return ans*sum;
    }
}