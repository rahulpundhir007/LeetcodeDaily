1class Solution {
2    public int[] findOriginalArray(int[] changed) {
3        if(changed.length%2!=0){
4            return new int[]{};
5        }
6        int max = 0;
7        for(int i = 0;i<changed.length;i++){
8            max = Math.max(changed[i],max);
9        }
10        int freq[] = new int[2*max+1];
11        for(int num:changed){
12            freq[num]++;
13        }
14        Arrays.sort(changed);
15        int idx = 0;
16        int ans[] = new int[changed.length/2];
17        if (freq[0] % 2 != 0) return new int[]{};
18        int zeroCount = freq[0] / 2;
19        for (int i = 0; i < zeroCount; i++) {
20            ans[idx++] = 0;
21        }
22        freq[0] = 0;
23        for(int i = 0;i<changed.length;i++){
24           if(freq[changed[i]]==0){
25            continue;
26           }
27           if(2 * changed[i] >= freq.length||freq[changed[i]]>freq[changed[i]*2]){
28            return new int[]{};
29           }
30           int cnt = freq[changed[i]];
31           for(int j = 0;j<cnt;j++){
32            ans[idx++] = changed[i];
33           }
34           freq[changed[i]*2]-=freq[changed[i]];
35           freq[changed[i]] = 0;
36        }
37       
38        return ans;
39    }
40}