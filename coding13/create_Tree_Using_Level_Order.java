package coding13;
import java.util.*;
public class create_Tree_Using_Level_Order {
	class node {
		int data;
		node left;
		node right;
		public node(int data) {
			this.data = data;
		}
	}private node root;
	
	

	public create_Tree_Using_Level_Order() {
		createTree();
	}
	private void createTree() {
		Scanner sc = new Scanner(System.in);
		int e =sc.nextInt();
		node nn = new node(e);
		root = nn;
		Queue<node> q = new LinkedList<>();
		q.add(nn);
		while(!q.isEmpty()) {
			node rv = q.poll();
			int c1 = sc.nextInt();
			int c2 = sc.nextInt();
			if(c1!=-1) {
				node NN = new node(c1);
				rv.left=NN;
				q.add(NN);
			}if(c2!=-1) {
				node NN = new node(c2);
				rv.right=NN;
				q.add(NN);
			}		
		}
	}
	public void Display() {
		Display(root);
	}

	private void Display(node nn) {
		if (nn == null) {
			return;
		}
		String s = "<--" + nn.data + "-->";
		if (nn.left != null) {
			s = nn.left.data + s;
		} else {
			s = "null" + s;
		}
		if (nn.right != null) {
			s = s + nn.right.data;
		} else {
			s = s + "null";
		}
		System.out.println(s);
		Display(nn.left);
		Display(nn.right);

	}


	public static void main(String[] args) {
		create_Tree_Using_Level_Order level = new create_Tree_Using_Level_Order();
//		 10 20 30 40 50 -1 70 -1 -1 60 -1 -1 -1 -1 -1	
		level.Display();

	}

}
