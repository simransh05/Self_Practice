package coding16;

import java.util.ArrayList;

public class HashMap <k,v>{
	public class node{
		k key;
		v val;
		node next;
	}
	ArrayList<node> bukt;
	public HashMap(int n) {
		bukt = new ArrayList<>();
		for(int i=0;i<n;i++) {
			bukt.add(null);
		}
	}
	public HashMap() {// default 4 size 
		this(4);
	}
	public void put(k key,v val) {
		
	}
	

}
