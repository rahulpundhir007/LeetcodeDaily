1class Solution {
2    boolean chk = false;
3    public List<Integer> lexicalOrder(int n) {
4        List<Integer> ans  =new ArrayList<>();
5        helper(n,0,ans);
6        return ans;
7    }
8    void helper(int n,int curr,List<Integer> ans){
9        if(curr>n){
10            return ;
11        }
12        for(int i = 0;i<=9;i++){
13            if(!chk){
14                chk = true;
15                continue;
16            }
17            if(curr*10+i<=n){
18            ans.add(curr*10+i);
19        }
20        helper(n,curr*10+i,ans);
21        }
22    }
23}