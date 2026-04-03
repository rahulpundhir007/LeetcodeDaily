1class Solution {
2    public List<String> letterCasePermutation(String s) {
3        List<String> ans = new ArrayList<>();
4        helper(ans,"",s);
5        return ans;
6    }
7    public void helper(List<String> ans,String res,String s){
8        if(s.length()==0){
9            ans.add(res);
10            return;
11        }
12        char ch = s.charAt(0);
13        if(ch>=48&&ch<=57){
14            helper(ans,res+ch,s.substring(1));
15        }
16         if(ch>=65&&ch<=90){
17             helper(ans,res+ch,s.substring(1));
18             helper(ans,res+(char)(ch+32),s.substring(1));
19        }
20         if(ch>=97&&ch<=122){
21             helper(ans,res+ch,s.substring(1));
22             helper(ans,res+(char)(ch-32),s.substring(1));
23        }
24    }
25}