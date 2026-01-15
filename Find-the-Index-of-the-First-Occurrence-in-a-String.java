1class Solution {
2    public int strStr(String haystack, String needle) {
3        if(needle.length()>haystack.length()){
4            return -1;
5        }
6        for(int i = 0;i<haystack.length()-needle.length()+1;i++){
7            if(haystack.substring(i,needle.length()+i).equals(needle)){
8                return i;
9            }
10        }
11        return -1;
12    }
13}