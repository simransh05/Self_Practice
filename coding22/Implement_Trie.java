package coding22;

public class Implement_Trie {

	public static void main(String[] args) {
		Trie t = new Trie();
		t.insert("apple");
		t.insert("raj");
		t.insert("rajesh");
		t.insert("ankit");
		t.insert("ankita");
		t.insert("vishal");
		t.insert("kaju");
		t.insert("bitu");
		System.out.println(t.search("app"));
		System.out.println(t.startsWith("app"));
	}

}
