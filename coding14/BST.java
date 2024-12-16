package coding14;

public class BST {
	public class node{
		int data;
		node left;
		node right;
	}
	private node root;
	public BST(int[] arr) {
		root= createSearchTree(arr,0,arr.length-1);
	}
	private node createSearchTree(int[] arr, int i, int j) {
		if(i>j) {
			return null;
		}
		int mid = (i+j)/2;
		node nn = new node();
		nn.data=arr[mid];
		nn.left=createSearchTree(arr,i,mid-1);
		nn.right=createSearchTree(arr,mid+1,j);
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
	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50,60,70,80};
		BST bst = new BST(arr);
		bst.display();
	}
	

}
