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
17    public TreeNode sortedArrayToBST(int[] nums) {
18        return helper(nums,0,nums.length-1);
19    }
20    public TreeNode helper(int nums[],int st,int ed){
21        if(st>ed){
22            return null;
23        }
24        int mid = (st+ed)/2;
25        TreeNode n = new TreeNode(nums[mid]);
26        n.left = helper(nums,st,mid-1);
27        n.right = helper(nums,mid+1,ed);
28        return n;
29    }
30}