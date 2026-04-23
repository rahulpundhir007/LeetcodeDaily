1class Solution {
2    public int similarPairs(String[] words) {
3        int c = 0;
4        for (int j = 0; j < words.length; j++) {
5            HashSet<Character> set1 = new HashSet<>();
6            for (char ch : words[j].toCharArray()) {
7                set1.add(ch);
8            }
9            for (int k = j + 1; k < words.length; k++) {
10                HashSet<Character> set2 = new HashSet<>();
11                for (char ch : words[k].toCharArray()) {
12                    set2.add(ch);
13                }
14
15                if (set1.equals(set2)) {
16                    c++;
17                }
18            }
19        }
20        return c;
21    }
22}