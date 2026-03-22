1class Solution {
2    public String replaceWords(List<String> al, String s) {
3        Collections.sort(al,(a,b)-> a.length()-b.length());
4        String arr[] = s.split(" ");
5        StringBuilder sb = new StringBuilder();
6        for(int i=0;i<arr.length;i++){
7            boolean chk = false;
8            for(int j=0;j<al.size();j++){
9                if(arr[i].startsWith(al.get(j))){
10                    sb.append(al.get(j)+" ");
11                   
12                    chk=true;
13                    break;
14                }
15            }
16            if(!chk){
17                sb.append(arr[i]+" ");
18                }
19        }
20        return sb.toString().trim();
21
22        
23    }
24}