package Practice3;
import java.util.ArrayList;
public class binarySearch {
	public static class node{
		int data;
		node left;
		node right;
		node (int data){
			this.data =data;
		}
		
	}
	public static node insert(node root, int val) {
		if(root ==null) {
			root =new node(val);
			return root;
		}if(root.data > val) {
			root.left =insert(root.left,val);
		}else {
			root.right = insert(root.right,val);
		}return root;
	}
	public static void inOrder(node root) {
		if(root == null) {
			return;
		} inOrder(root.left);
		System.out.print(root.data+"  " );
		inOrder(root.right);
	}
	public static boolean search(node root , int target) {
		if(root == null) {
			return false;
		}if(root.data== target) {
			return true;
		}else if (root.data > target) {
			return search(root.left,target);
		}else {
			return search(root.right,target);
		}
	}
	public static node delete(node root  , int val) {
		if(root.data>val) {
			root.left = delete(root.left,val);
		}else if(root.data<val) {
			root.right = delete(root.right,val);
		}else {
			if(root.left== null && root.right ==null) {
				return null;
			}
			if(root.left ==null) {
				return root.right;
			}else if(root.right == null) {
				return root.left;
			}

			node IS = inorderSuccessor(root.right);
			root.data = IS.data;
			root.right = delete(root.right,IS.data);
		}return root;
	}
	public static node inorderSuccessor(node root) {
		while(root.left!=null) {
			root =root.left;
		}return root;
	}
	
	//range between x&y
	public static void range(node root ,int x ,int y) {
		if(root ==null) {
			return;
		}
		if(root.data>=x && root.data<=y) {
			range(root.left , x,y);
			System.out.print(root.data+" ");
			range(root.right,x,y);
		}else if(root.data>=y) {
			range(root.left,x,y);
		}else {
			range(root.right,x,y);
		}
	}
	public static void Path2Leaf(node root,ArrayList<Integer>path) {
		if(root==null) {
			return;
		}
		path.add(root.data);

		if(root.left==null && root.right ==null) {
			printPath(path);
		}else {
			Path2Leaf(root.left ,path);
			Path2Leaf(root.right,path);
			
		}
		path.remove(path.size()-1);
	}
	public static void printPath(ArrayList<Integer> path) {
		for(int i =0;i<path.size();i++) {
			System.out.print(path.get(i)+"-->");
		}System.out.println();
	}
	public static void main(String[] args) {
		int[] value = {5,1,3,4,2,7};
		node root = null;
		for(int i =0;i<value.length;i++) {
			root = insert(root ,value[i]);
		}
//		inOrder(root);
//		System.out.println(search(root,8));
//		delete(root,5);
//		inOrder(root);
//		range(root,3,7);
		Path2Leaf(root,new ArrayList<>());

	}

}
