class Solution {
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> c=new LinkedList<>();
        preOrder(root1,c);
        preOrder(root2,c);
        Collections.sort(c);
        return c;
    }
    private void preOrder(TreeNode t,List<Integer> d)
    {
        if(t==null)
        {
            return;
        }
        d.add(t.val);
        preOrder(t.left,d);
        preOrder(t.right,d);
    }
}
//this is leetCode problem number 1305
