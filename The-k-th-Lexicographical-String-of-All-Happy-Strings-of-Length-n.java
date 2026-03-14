1class Solution {
2    static{
3    for(int i = 0;i<200;i++){
4        getHappyString(0,5);
5    }
6    }
7    public  static String getHappyString(int n, int k) {
8        ArrayList<String> arr = new ArrayList<>();
9        String s = "";
10        helper(arr,s,n);
11        
12        if(k>arr.size()){
13            return "";
14        }
15        
16        return arr.get(k-1);
17    }
18    public static void helper(ArrayList<String> arr,String s,int n){
19        if(s.length()==n){
20            arr.add(s);
21            return ;
22        }  if(s.length()<1){
23            helper(arr,s+"a",n);
24            helper(arr,s+"b",n);
25            helper(arr,s+"c",n);
26        }
27        else{
28            if(s.charAt(s.length()-1)=='a'){
29                helper(arr,s+"b",n);
30                helper(arr,s+"c",n);
31            }
32            if(s.charAt(s.length()-1)=='b'){
33                helper(arr,s+"a",n);
34                helper(arr,s+"c",n);
35            }
36            if(s.charAt(s.length()-1)=='c'){
37                helper(arr,s+"a",n);
38                helper(arr,s+"b",n);
39            }
40        }
41    }
42}