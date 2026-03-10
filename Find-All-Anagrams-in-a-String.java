1class Solution {
2    public List<Integer> findAnagrams(String s, String p) {
3        List<Integer> ans = new ArrayList<>();
4        int freq[] = new int[26];
5        int freq2[] = new int[26];
6        for(int i = 0;i<p.length();i++){
7            freq[p.charAt(i)-'a']++;
8        }
9        int left = 0;
10        for(int i = 0;i<s.length();i++){
11            freq2[s.charAt(i)-'a']++;
12            if(i-left+1>p.length()){
13                freq2[s.charAt(left)-'a']--;
14                left++;
15            }
16            if(Arrays.equals(freq,freq2)){
17                ans.add(left);
18            }
19        }
20    return ans;
21    }
22}