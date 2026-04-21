1class Solution {
2    public String sortString(String s) {
3        int freq[] = new int[26];
4        for(int i = 0;i<s.length();i++){
5            char ch = s.charAt(i);
6            freq[ch-'a']++;
7        }
8        StringBuilder sb = new StringBuilder();
9        while(sb.length()!=s.length()){
10
11        for(int i = 0;i<26;i++){
12            if(freq[i]>0){
13                char ch = (char)(97+i);
14                sb.append(ch);
15                freq[i]--;
16            }
17        }
18        for(int i = 25;i>=0;i--){
19            if(freq[i]>0){
20                char ch = (char)(97+i);
21                sb.append(ch);
22                freq[i]--;
23            }
24        }
25        }
26       return sb+"";
27    }
28}