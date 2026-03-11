1class Solution {
2    public String longestPalindrome(String s) {
3        String res = "";
4        int max = 0;
5        if(s.length()==1){
6            return s;
7        }
8        for(int i = 0;i<s.length()-1;i++){
9            //FOR ODD LENGTH
10            int low = i;
11            int high = i;
12            while(s.charAt(low)==s.charAt(high)){
13                low--;high++;
14                if(low<0||high==s.length()){
15                    break;
16                }
17            }
18            if(s.substring(low+1,high).length()>res.length()){
19                res = s.substring(low+1,high);
20            }
21            //For even length
22            int l1 = i;
23            int l2 = i+1;
24            while(s.charAt(l1)==s.charAt(l2)){
25                l1--;l2++;
26                if(l1<0||l2==s.length()){
27                    break;
28                }
29            }
30            if(s.substring(l1+1,l2).length()>res.length()){
31                res = s.substring(l1+1,l2);
32            }
33
34        }
35        
36        return res;
37    }
38   
39}