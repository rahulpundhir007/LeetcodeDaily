class Solution {
    public int maxProduct(int n) {
       int temp = n;
       int max = 0;
       int smax = 0;
       while(temp!=0){
        int r = temp%10;
        max  = Math.max(max,r);
        temp/=10;
       } 
       int c = 0;
       while(n!=0){
        int r = n%10;
       if(r==max&&c!=0){
        smax = max;
        break;
       }
       if(r==max){
        c++;
       }
       if(r>smax&&r!=max){
        smax = r;
       }
        n/=10;
       }
      
       return max*smax;
    }
}