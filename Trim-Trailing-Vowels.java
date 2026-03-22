1class Solution {
2    public String trimTrailingVowels(String s) {
3        int j = s.length()-1;
4
5        while(j>-1&&(s.charAt(j)=='a'||s.charAt(j)=='e'||s.charAt(j)=='i'||s.charAt(j)=='o'||s.charAt(j)=='u')){
6          j--;
7        }
8        return s.substring(0,j+1);
9    }
10}