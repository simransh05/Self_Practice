package coding13;

import java.util.Scanner;

import java.util.*;

public class Binary_Tree {
	class node{
		int data;
		node left;
		node right;
	}
	private node root;
	Scanner sc = new Scanner(System.in);
	public Binary_Tree() {
		root = createTree();
	}
	private node createTree() {
		int item =sc.nextInt();
		node nn = new node();
		nn.data=item;
		boolean hasLeftChild=sc.nextBoolean();
		if(hasLeftChild) {
			nn.left=createTree();
		}
		boolean hasRightChild=sc.nextBoolean();
		if(hasRightChild) {
			nn.right=createTree();
		}
		return nn;
	}
	public void display() {
		Display(root);
	}
	private void Display(node nn) {
		if(nn==null) {
			return;
		}
		String s = "";
		s="<--" + nn.data+"-->";
		if(nn.left!=null) {
			s=nn.left.data+s;
		}else {
			s=null+s;
		}if(nn.right!=null) {
			s+=nn.right.data;
		}else {
			s+=null;
		}System.out.println(s);
		Display(nn.left);
		Display(nn.right);
	}
	public int max() {
		return Max(root);
	}
	public int Max(node nn) {
		if(nn==null) {
			return Integer.MIN_VALUE; //0 not because negative values can also be there 
		}int maxL = Max(nn.left);
		int maxR = Max(nn.right);
		return Math.max(nn.data,Math.max(maxL, maxR));
	}
	public boolean find(int item) {
		return Find(root,item);
	}
	private boolean Find(node nn , int item) {
		if(nn==null) {
			return false;
		}if(nn.data==item) {
			return true;
		}boolean findL = Find(nn.left,item);
		boolean FindR = Find(nn.right,item);
		return (findL ||FindR);
	}
	public int height() {
		return Height(root);
	}
	private int Height(node nn) {
		if(nn==null) {
			return -1; // not 0 because the single node value will become 1 
		}int hLeft = Height(nn.left);
		int hRight = Height(nn.right);
		return Math.max(hLeft, hRight)+1;
	}
	public void preOrder() {
		preOrder(root);
		System.out.println();
	}
	private void preOrder(node nn) {
		if(nn==null) {
			return ;
		}System.out.print(nn.data+"  ");
		preOrder(nn.left);
		preOrder(nn.right);
	}
	public void inOrder() {
		inOrder(root);
		System.out.println();
	}
	private void inOrder(node nn) {
		if(nn==null) {
			return ;
		}inOrder(nn.left);
		System.out.print(nn.data+"  ");
		inOrder(nn.right);
	}
	public void postOrder() {
		postOrder(root);
		System.out.println();
	}
	private void postOrder(node nn) {
		if(nn==null) {
			return ;
		}postOrder(nn.left);
		postOrder(nn.right);
		System.out.print(nn.data+"  ");
	}
	public void levelOrder() {
		Queue<node> q = new LinkedList<>();
		q.add(root);
		while(!q.isEmpty()) {
			node rv = q.remove();
			System.out.print(rv.data+"  ");
			if(rv.left!=null) {
				q.add(rv.left);
			}if(rv.right!=null) {
				q.add(rv.right);
			}
		}System.out.println();
	}

}
