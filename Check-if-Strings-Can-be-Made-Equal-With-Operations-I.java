1class Solution {
2    public boolean canBeEqual(String s1, String s2) {
3        if(s1.charAt(0)!=s2.charAt(0)&&s1.charAt(0)!=s2.charAt(2)){
4            return false;
5        }
6        if(s1.charAt(1)!=s2.charAt(1)&&s1.charAt(1)!=s2.charAt(3)){
7            return false;
8        }
9        if(s1.charAt(0)==s2.charAt(2)){
10            if(s2.charAt(0)!=s1.charAt(2)){
11                return false;
12            }
13        }
14        if(s1.charAt(1)==s2.charAt(3)){
15            if(s2.charAt(1)!=s1.charAt(3)){
16                return false;
17            }
18        }
19        if(s1.charAt(2)!=s2.charAt(2)){
20            if(s1.charAt(2)!=s2.charAt(0)){
21                return false;
22            }
23        }
24        if(s1.charAt(3)!=s2.charAt(3)){
25            if(s1.charAt(3)!=s2.charAt(1)){
26                return false;
27            }
28        }
29        return true;
30    }
31}