1class Solution {
2    public List<String> validStrings(int n) {
3        List<String> ans  = new ArrayList<>();
4        helper(ans,"",n);
5        return ans;
6    }
7    void helper(List<String> ans,String s,int n){
8        if(n==0){
9            ans.add(s);
10            return;
11        }
12        if(s.length()==0){
13            helper(ans,s+"0",n-1);
14            helper(ans,s+"1",n-1);
15        }
16        else if(s.charAt(s.length()-1)=='0'){
17            helper(ans,s+"1",n-1);
18        }
19        else{
20             helper(ans,s+"0",n-1);
21             helper(ans,s+"1",n-1);
22        }
23    }
24}