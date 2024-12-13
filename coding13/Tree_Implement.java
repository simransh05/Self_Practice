package coding13;

public class Tree_Implement {

	public static void main(String[] args) {
// 10 true 20 true 40 false false true 50 false false true 30 false true 60 true 70 false false false
		Binary_Tree bt = new Binary_Tree();
//		bt.display();
//		System.out.println(bt.max());
//		System.out.println(bt.find(80));
//		System.out.println(bt.height());
		bt.preOrder();
		bt.inOrder();
		bt.postOrder();
		bt.levelOrder();

	}

}
