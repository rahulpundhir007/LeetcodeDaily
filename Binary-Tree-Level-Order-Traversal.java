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
17    public List<List<Integer>> levelOrder(TreeNode root) {
18      List<List<Integer>>res = new ArrayList<>();
19      if(root==null){
20        return res;
21        }
22      Queue<TreeNode> q = new LinkedList<>();
23      q.add(root);
24      while(!q.isEmpty()){
25        int c = q.size();
26        ArrayList<Integer> arr = new ArrayList<>();
27        for(int i = 0;i<c;i++){
28                TreeNode n = q.poll();
29                arr.add(n.val);
30                if(n.left!=null){
31                    q.add(n.left);
32                }
33                if(n.right!=null){
34                    q.add(n.right);
35                }
36        }
37        res.add(arr);
38      }
39return res;
40    }
41}