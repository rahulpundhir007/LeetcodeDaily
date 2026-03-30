1class Solution {
2    String map[] = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
3    public List<String> letterCombinations(String s) {
4        List<String> arr = new ArrayList<>();
5        helper(s,"",arr);
6        return arr;
7    }
8    public void helper(String s,String ans,List<String> arr){
9        if(s.length()==0){
10            arr.add(ans);
11            return;
12        }
13        String t = map[s.charAt(0)-'0'];
14        for(int i = 0;i<t.length();i++){
15        helper(s.substring(1),ans+t.charAt(i),arr);
16        }
17    }
18}