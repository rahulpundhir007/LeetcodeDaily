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
17    public int sumOfLeftLeaves(TreeNode root) {
18         Queue<TreeNode> q = new LinkedList<>();
19     q.add(root);
20     int sum = 0;
21     
22     while(q.size()>0){
23        int c = q.size();
24        ArrayList<Integer> arr = new ArrayList<>();
25        for(int i = 0;i<c;i++){
26            TreeNode n = q.poll();
27            arr.add(n.val);
28            if(n.left!=null){
29                q.add(n.left);
30            }
31            if(n.right!=null){
32                q.add(n.right);
33            }
34            if(n.left!=null&&n.left.left==null&&n.left.right==null){
35                sum+=n.left.val;
36            }
37        }
38       
39     }
40     return sum;
41    }
42}