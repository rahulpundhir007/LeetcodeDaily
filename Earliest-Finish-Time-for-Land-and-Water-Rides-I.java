1class Solution {
2    public int earliestFinishTime(int[] landStartTime, int[] landDuration,
3                                  int[] waterStartTime, int[] waterDuration) {
4
5        int ans = Integer.MAX_VALUE;
6
7        for (int i = 0; i < landStartTime.length; i++) {
8            for (int j = 0; j < waterStartTime.length; j++) {
9
10                // Land -> Water
11                int landFinish = landStartTime[i] + landDuration[i];
12                int finish1 = Math.max(landFinish, waterStartTime[j]) + waterDuration[j];
13
14                // Water -> Land
15                int waterFinish = waterStartTime[j] + waterDuration[j];
16                int finish2 = Math.max(waterFinish, landStartTime[i]) + landDuration[i];
17
18                ans = Math.min(ans, Math.min(finish1, finish2));
19            }
20        }
21
22        return ans;
23    }
24}