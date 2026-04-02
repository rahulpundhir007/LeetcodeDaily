1class Solution {
2    public int firstMatchingIndex(String s) {
3       int st = 0;
4       int ed = s.length()-1;
5       while(st<=ed){
6        if(s.charAt(st)==s.charAt(ed)){
7            return st;
8        }
9        st++;
10        ed--;
11       }
12       return -1;
13    }
14}