1class Solution {
2    public List<String> removeAnagrams(String[] words) {
3        List<String> ans = new ArrayList<>();
4        int j =0;
5        ans.add(words[0]);
6        for(int i = 1;i<words.length;i++){
7            if(!check(ans.get(ans.size()-1),words[i])){
8                ans.add(words[i]);
9            }
10        }
11        return ans;
12    }
13    public boolean check(String s1,String s2){
14        if(s1.length()!=s2.length()){
15            return false;
16        }
17        int hash[] = new int[26];
18        for(int i = 0;i<s1.length();i++){
19            hash[s1.charAt(i)-'a']++;
20        }
21        for(int i = 0;i<s2.length();i++){
22            hash[s2.charAt(i)-'a']--;
23        }
24        for(int i = 0;i<26;i++){
25            if(hash[i]>0){
26                return false;
27            }
28        }
29        return true;
30
31    }
32}