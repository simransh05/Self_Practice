package coding13;

import java.util.ArrayList;
import java.util.List;

public class Tree_Ques {
	public class TreeNode { // LeetCode 199 Binary Tree Right Side View
	     int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode() {}
	      TreeNode(int val) { this.val = val; }
	      TreeNode(int val, TreeNode left, TreeNode right) {
	          this.val = val;
	          this.left = left;
	          this.right = right;
	     }
	 }
	 
	class Solution {
	    public List<Integer> rightSideView(TreeNode root) {
	        List<Integer>  list = new ArrayList<>();
	        Side(root,0,list);
	        return list;
	    }
	    int maxd =0;
	    public void Side(TreeNode root ,int cl,  List<Integer> list) {
	        if(root==null){
	            return;
	        }
	        if(maxd < cl) { // first call 0<1
                list.add(root.val);
                maxd =cl; // max depth turn to 1
            }
	        Side(root.right,cl+1,list);
	        Side(root.left,cl+1,list);
	    }
	}

	public static void main(String[] args) {
		// LeetCode 199 Binary Tree Right Side View
		// LeetCode 236 Lowest common ancestor in binary tree
		// LeetCode 543 Diameter of Binary Tree
		
		

	}

}
