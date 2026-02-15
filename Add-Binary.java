1class Solution {
2    public String addBinary(String a, String b) {
3        StringBuilder sb = new StringBuilder();
4        int i = a.length()-1;
5        int j = b.length()-1;
6        int carry = 0;
7        while(i>=0&&j>=0){
8            int sum = a.charAt(i)-'0'+ b.charAt(j)-'0'+carry;
9            if(sum==2){
10            sb.append("0");
11            carry = 1;
12            }
13            else if(sum==3){
14           sb.append("1");
15            carry = 1;
16            }
17            else if(sum==0){
18            sb.append("0");
19            carry = 0;
20            }
21            else{
22               sb.append("1"); 
23               carry = 0;
24            }
25            i--;
26            j--;
27        }
28        while(i>=0){
29            int sum = a.charAt(i)-'0'+carry;
30            if(sum==2){
31            sb.append("0");
32            carry = 1;
33            }
34            else if(sum==3){
35           sb.append("1");
36            carry = 1;
37            }
38            else if(sum==0){
39            sb.append("0");
40            carry = 0;
41            }
42            else{
43               sb.append("1"); 
44               carry = 0;
45            }
46            i--;
47        }
48        while(j>=0){
49            int sum = b.charAt(j)-'0'+carry;
50            if(sum==2){
51            sb.append("0");
52            carry = 1;
53            }
54            else if(sum==3){
55           sb.append("1");
56            carry = 1;
57            }
58            else if(sum==0){
59            sb.append("0");
60            carry = 0;
61            }
62            else{
63               sb.append("1"); 
64               carry = 0;
65            }
66            j--;
67        }
68       if(carry==1){
69        sb.append(carry);
70       }
71        return sb.reverse().toString();
72    }
73}