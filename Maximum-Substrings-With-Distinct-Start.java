1class Solution {
2    public int maxDistinct(String s) {
3        HashSet<Character> set = new HashSet<>();
4        for(int i = 0;i<s.length();i++){
5            set.add(s.charAt(i));
6        }
7        return set.size();
8    }
9}