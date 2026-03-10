1class Solution {
2    public boolean checkInclusion(String s1, String s2) {
3        if(s1.length()>s2.length()){
4            return false;
5        }
6        int freq[] = new int[26];
7        for(int i = 0;i<s1.length();i++){
8             freq[s1.charAt(i)-'a']++;
9        }
10         int freq2[] = new int[26];
11         int left =  0;
12         for(int i = 0;i<s2.length();i++){
13             freq2[s2.charAt(i)-'a']++;
14             if(i-left+1>s1.length()){
15                 freq2[s2.charAt(left)-'a']--;
16                 left++;
17             }
18             if(Arrays.equals(freq,freq2)){
19                return true;
20             }
21
22        }
23        return false;
24    }
25}