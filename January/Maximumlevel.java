//Maximum Level Sum of a Binary Tree
//leetcode :1137
class Solution {
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int maxsum = Integer.MIN_VALUE;
        int level = 1;
        int ans = 0;
        while(!q.isEmpty()){
            int c = q.size();
            int sum = 0;
            for(int i = 0;i<c;i++){
                TreeNode n = q.poll();
                sum+=n.val;
                if(n.left!=null){
                    q.add(n.left);
                }
                if(n.right!=null){
                    q.add(n.right);
                }
            }
           if(maxsum<sum){
            maxsum = sum;
            ans = level;
           }
            level++;
        }
        return ans;
    }
}
