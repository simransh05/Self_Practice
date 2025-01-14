package coding16;

import java.util.ArrayList;

public class HashMap <k,v>{
	public class node{
		k key;
		v val;
		node next;
	}
	private ArrayList<node> bukt;
	private int size =0;
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
		int idx = hashFun(key);
		node temp = bukt.get(idx);
		while(temp!=null) {
			if(temp.key.equals(key)) {
				temp.val = val;
			}temp = temp.next;
		}node nn = new node();
		nn.key=key;
		nn.val=val;
		temp = bukt.get(idx);
		nn.next=temp;
		bukt.set(idx, nn);
		size++;
		double lf= (1.0 * size)/bukt.size();
		double thf = 2.0;
		if(lf>thf) {
			rehashing();
		}
	}
	private void rehashing() {
		// TODO Auto-generated method 
		ArrayList<node> a = new ArrayList<>();
		for(int i=0;i<bukt.size()*2 ;i++) {
			a.add(null);
		}ArrayList<node> old_bukt = bukt;
		bukt=a;
		size=0;
		for(node temp:old_bukt) {
			while(temp!=null) {
				put(temp.key,temp.val);
				temp = temp.next;
			}
		}
	}
	public boolean containsKey(k key) {
		int idx = hashFun(key);
		node temp = bukt.get(idx);
		while(temp!=null) {
			if(temp.key.equals(key)) {
				return true;
			}temp = temp.next;
		}return false;
	}
	public v get(k key) {
		int idx = hashFun(key);
		node temp = bukt.get(idx);
		while(temp!=null) {
			if(temp.key.equals(key)) {
				return temp.val;
			}temp = temp.next;
		}return null;
	}
	public v remove(k key) {
		int idx = hashFun(key);
		node curr = bukt.get(idx);
		node prev = null;
		while(curr!=null) {
			if(curr.key.equals(key)) {
				break;
			}prev =curr;
			curr= curr.next;
		}if(curr==null) {
			return null;
		}
		else if(prev ==null) {
			curr.next=null;
			size--;
			return curr.val;
		}else {
			prev.next=curr.next;
			curr.next=null;
			size--;
			return curr.val;
		}
	}
	public int hashFun(k key) {
		int n = key.hashCode()%bukt.size();
		if(n<0) {
			n+=bukt.size();
		}return n;
	}
	public String toString() {
		String s= "{ ";
		for(node temp:bukt) {
			while(temp!=null) {
				s=s+temp.key+" = " + temp.val+" , ";
				temp = temp.next;
			}
		}s=s.trim();
		return s+" }";
	}
	

}
