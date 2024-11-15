package Practice3;
import java.util.*;
public class Binary {
	static class node{
		int data;
		node left;
		node right;
		node(int data){
			this.data=data;
			this.left = null;
			this.right = null;
		}
	}
	static class binaryTree{
		static int indx=-1;
		static node buildTree(int[] nodes) {
			indx++;
			if(nodes[indx]==-1) {
			return null;
		    }node newNode = new node(nodes[indx]);
		    newNode.left = buildTree(nodes);
			newNode.right = buildTree(nodes);
			return newNode;	
		}
	}
	public static void preorder(node root) {
		if(root == null) {
//			System.out.print("-1"+"  ");
			return ;
		}System.out.print(root.data+"  ");
		preorder(root.left);
		preorder(root.right);
	}
	public static void postorder(node root) {
		if(root==null) {
			return;
		}postorder(root.left);
		postorder(root.right);
		System.out.print(root.data+"  ");
	}
	public static void inorder(node root) {
		if(root==null) {
			return;
		}inorder(root.left);
		System.out.print(root.data+"  ");
		inorder(root.right);
	}
	public static void levelOrder(node root) {
		if(root == null) {
			return;
		}
		Queue<node> q =new LinkedList<>();
		q.add(root);
		q.add(null);
		while(!q.isEmpty()) {
			node currNode = q.remove();
			if(currNode == null) {
				System.out.println();
				if(q.isEmpty()) {
					break;
				}else {
					q.add(null);
				}
			}else {
				System.out.print(currNode.data+" ");
			if(currNode.left!=null) {
				q.add(currNode.left);
			}if(currNode.right!=null) {
				q.add(currNode.right);
			}
			}
		}
	}
	public static int countNode(node root ) {
		if(root ==null) {
			return 0;
		} int x = countNode(root.left);
		int y = countNode(root.right);
		return x+y+1;
	}
	public static int sumNode(node root ) {
		if(root ==null) {
			return 0;
		} int x = sumNode(root.left);
		int y = sumNode(root.right);
		return x+y+root.data;
	}
	public static int height(node root) {
		if(root == null) {
			return 0;
		}int leftHeight = height(root.left);
		int rightHeight = height(root.right);
		return Math.max(leftHeight, rightHeight)+1;
	}
	public static int diameter(node root) { // 0(n^2)
		if(root == null) {
			return 0;
		}int diam1 = diameter(root.left);
		int diam2 = diameter(root.right);
		int diam3 = height(root.left) +height(root.right)+1;
		return Math.max(diam3 ,Math.max(diam1, diam2));
	}
	public static class treeInfo{
		int height ;
		int diam ;
		 treeInfo(int height, int diam) {
			this.height = height;
			this.diam = diam;
		}
	}
	public static treeInfo diameter2(node root) {
		if(root == null) {
		    return new treeInfo(0, 0);
		}
        treeInfo left =diameter2(root.left);
		treeInfo right = diameter2(root.right);
		
		int heightTree= Math.max(left.height , right.height)+1;
		int diam1 = left.diam;
		int diam2 = right.diam;
		int diam3 = left.height +right.height+1;
		int treeDiam = Math.max(diam3 , Math.max(diam2, diam1));
		return new treeInfo(heightTree ,treeDiam);
	}
	public static void main(String[] args) {
		int[] node = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
		binaryTree tree = new binaryTree();
		node root = tree.buildTree(node);
//		preorder(root);
//		System.out.println();
//		postorder(root);
//		System.out.println();
//		inorder(root);
//		levelOrder(root);
//		System.out.print(countNode(root));
//		System.out.println(sumNode(root));
//		System.out.println(height(root));
//		System.out.println(diameter(root));
		System.out.println(diameter2(root).diam);
//		System.out.println(root.data);
	}
}
