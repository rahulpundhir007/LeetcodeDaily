1class Solution {
2    public boolean checkStrings(String s1, String s2) {
3        int n = s1.length()/2;
4        if(s1.length()%2!=0){
5            n++;
6        }
7        char arr[] = new char[n];
8        char arr2[] = new char[n];
9        char arr3[] = new char[s1.length()/2];
10        char arr4[] = new char[s1.length()/2];
11        int idx = 0;
12        int idx2 = 0;
13        int idx3 = 0;
14        int idx4 = 0;
15        for(int i =0;i<s1.length();i++)
16        {
17            if(i%2==0){
18
19            arr[idx++] = s1.charAt(i);
20            arr2[idx2++] = s2.charAt(i);
21
22            }
23            else{
24               arr3[idx3++] = s1.charAt(i);
25               arr4[idx4++] = s2.charAt(i);  
26            }
27
28        }
29       Arrays.sort(arr);
30       Arrays.sort(arr2);
31       Arrays.sort(arr3);
32       Arrays.sort(arr4);
33       return  Arrays.equals(arr,arr2)&& Arrays.equals(arr3,arr4);
34    }
35}