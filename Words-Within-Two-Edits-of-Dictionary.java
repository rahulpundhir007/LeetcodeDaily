1class Solution {
2    public List<String> twoEditWords(String[] s, String[] d) {
3        List<String> ans = new ArrayList<>();
4        for(int i = 0;i<s.length;i++){
5            String st = s[i];
6            for(int j = 0;j<d.length;j++){
7                int c = 0;
8                 String sd = d[j];
9                 for(int k = 0;k<sd.length();k++){
10                    if(sd.charAt(k)!=st.charAt(k)){
11                        c++;
12                    }
13                 }
14                 if(c<=2){
15                    ans.add(st);
16                    break;
17                 }
18            }
19            
20        }
21        return ans;
22    }
23}