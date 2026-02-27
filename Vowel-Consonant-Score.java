1class Solution {
2    public int vowelConsonantScore(String s) {
3        // String alag = "0123456789 ";
4        int c = 0;
5        int v = 0;
6        for(int i = 0;i<s.length();i++){
7            char ch = s.charAt(i);
8            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
9                v++;
10            }
11            else if(ch==' '||Character.isDigit(ch)){
12                continue;
13            }
14            else{
15                c++;
16            }
17        }
18        if(c==0){
19            return 0;
20        }
21        return v/c;
22    }
23}