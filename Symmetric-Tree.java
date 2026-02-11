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
17    boolean ans=true;
18    public void fun(TreeNode head1,TreeNode head2){
19        if(head1==null && head2==null){
20            return;
21        }
22        if(head1!=null && head2==null){
23            ans=false;
24            return;
25        }
26        if(head1==null && head2!=null){
27            ans=false;
28            return;
29        }
30        if(head1.val!=head2.val){
31            ans=false;
32            return;
33        }
34        fun(head1.left,head2.right);
35        fun(head1.right,head2.left);
36    }
37    public boolean isSymmetric(TreeNode root) {
38        fun(root,root);
39        return ans;
40    }
41}