1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    public boolean isEvenOddTree(TreeNode root) {
18         Queue<TreeNode> q = new LinkedList<>();
19         q.add(root);
20         int count = 0;
21         if(root.left==null&&root.right==null && root.val%2!=0)
22           return true;
23           while(q.size()>0){
24            int c= q.size();
25            int min = Integer.MIN_VALUE;
26            int max  = Integer.MAX_VALUE;
27            for(int i = 0;i<c;i++){
28                TreeNode n = q.poll();
29                if((count%2==0&&n.val%2==0)||(count%2!=0&&n.val%2!=0)){
30                    return false;
31                }
32                if(count%2==0&&n.val<=min){
33                    return false;
34                }
35                if(count%2==0){
36                   min= n.val;
37                }
38                if(count%2!=0&&n.val>=max){
39                    return false;
40                }
41                if(count%2!=0){
42                    max = n.val;
43                }
44                if(n.left!=null){
45                    q.add(n.left);
46                }
47                if(n.right!=null){
48                    q.add(n.right);
49                }
50            }
51            
52            count++;
53           }
54           return true;
55}
56}