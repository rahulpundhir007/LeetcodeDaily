1class Solution {
2    public int bitwiseComplement(int n) {
3        StringBuilder sb = new StringBuilder();
4        if(n==0){
5            return 1;
6        }
7       while(n!=0){
8        int r = n%2;
9        if(r==1){
10            sb.append(0);
11        }
12        else{
13            sb.append(1);
14        }
15        n/=2;
16       }
17        sb.reverse();
18        int c= 0;
19        int ans =0;
20        for(int i = sb.length()-1;i>=0;i--){
21            if(sb.charAt(i)=='1'){
22                ans = ans+ (1<<c);
23            }
24            c++;
25        }
26        return ans;
27    }
28}