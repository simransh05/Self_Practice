package practice4;
import java.util.*;
public class HashMapCode {
	static class HashMap<k,v>{
		private class node{
			k key;
			v value;
			public node (k key , v value) {
				this.key =  key;
				this.value = value;
			}
		}
		private int n; // no.of nodes
		private int N; // size
		private LinkedList<node> bucket[];
		
		@SuppressWarnings("unchecked")
		public HashMap(){
			this.N = 4;
			this.bucket = new LinkedList[4];
			for(int i =0;i<4;i++) {
				this.bucket[i]= new LinkedList<>();
			}
		}
		public int hashFunction(k key) {
			int bi= key.hashCode();
			return Math.abs(bi)%N;
		}
		private int searchinLL(k key,int bi) {
			LinkedList<node> ll = bucket[bi];
			for(int i =0;i<ll.size();i++) {
				if(ll.get(i).key == key) {
					return i;
				}
			}return -1;
		}
		private void rehash() {
			LinkedList<node> oldBucket[]= bucket;
			bucket =new LinkedList[2*N];
			for(int i=0;i<oldBucket.length;i++) {
				LinkedList<node> ll = bucket[i];
				for(int j =0;j<ll.size();j++) {
					node Node = ll.get(j);
					put(Node.key,Node.value);
				}
			}
		}
		public void put(k key ,v value) {
			int bi = hashFunction(key);
			int di = searchinLL(key,bi);
			if(di ==-1) {
				bucket[bi].add(new node(key,value));
				n++;
			}else {
				node data = bucket[bi].get(di);
				data.value = value;
			}
			double lambda = (double) n/N;
			if(lambda > 2.0) {
				rehash();
			}
		}
		public v get(k key) {
			int bi = hashFunction(key);
			int di = searchinLL(key,bi);
			if(di ==-1) {
				return null;
			}else {
				node data = bucket[bi].get(di);
				return data.value;
			}
		}
		public boolean contains(k key) {
			int bi = hashFunction(key);
			int di = searchinLL(key,bi);
			if(di ==-1) {
				return false;
			}else {
				return true;
			}
		}
		public v remove(k key) {
			int bi = hashFunction(key);
			int di = searchinLL(key,bi);
			if(di ==-1) {
				return null;
			}else {
				node data = bucket[bi].remove(di);
				return data.value;
			}
		}
		public ArrayList<k> keySet(){
			ArrayList<k> keys = new ArrayList<>();
			for(int i=0;i<bucket.length;i++) {
				LinkedList<node> ll = bucket[i];
				for(int j =0;j<ll.size();j++) {
					node Node = ll.get(j);
					keys.add(Node.key);
				}
			}return keys;
		}
		public boolean isEmpty() {
			return n==0;
		}
	}
	public static void main(String[] args) {
		HashMap<String,Integer> map =new  HashMap<>();
		map.put("India",120 );
		map.put("China",150);
		map.put("US", 50);
		ArrayList<String>key = map.keySet();
		for(int i =0;i<key.size();i++) {
			System.out.println(key.get(i)+"  "+ map.get(key.get(i)));
		}
		map.remove("China");
		System.out.println(map.get("China"));
	}

}
