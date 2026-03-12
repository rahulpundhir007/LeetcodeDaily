1class Solution {
2    public int numberOfSubstrings(String s) {
3        int left = 0;
4        int ans = 0;
5        int freq[] = new int[3];
6        HashMap<Character,Integer> map = new HashMap<>();
7        for(int i = 0;i<s.length();i++){
8            char ch = s.charAt(i);
9            freq[ch-'a']++;
10            while(freq[0]>=1&&freq[1]>=1&&freq[2]>=1){
11             ans = ans+s.length()-i;
12             freq[s.charAt(left)-'a']--;
13             left++;
14            }
15        }
16        return ans;
17    }
18}