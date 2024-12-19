package coding15;

import java.util.ArrayList;

public class Heap {
	private ArrayList<Integer> ar = new ArrayList<>();
	public void add(int item) {
		ar.add(item);
		upHeapify(ar.size()-1);
	}
	private void upHeapify(int ci) {
		int pi = (ci-1)/2;
		if(ar.get(pi)>ar.get(ci)) {
			swap(ci,pi);
			upHeapify(pi);
		}
	}
	private void swap(int ci, int pi) {
		int pi_th = ar.get(pi);
		int ci_th =ar.get(ci);
		ar.set(pi, ci_th);
		ar.set(ci,pi_th);
		
	}
	public int get() {
		return ar.get(0);
	}
	public int size() {
		return ar.size();
	}
	public void display() {
		System.out.println(ar);
	}
	public int remove( ) {
		swap(0,ar.size()-1);
		int rv = ar.remove(ar.size()-1);
		downHeapify(0);
		return rv;
	}
	private void downHeapify(int pi) {
		int lci = (2*pi)+1;
		int rci = (2*pi)+2;
		int minimum = pi;
		if(lci < ar.size() && ar.get(lci)<ar.get(minimum)) {
			minimum =lci;
		}if(rci < ar.size() && ar.get(rci)<ar.get(minimum)) {
			minimum = rci;
		}if(minimum!=pi) {
			swap(pi,minimum);
			downHeapify(pi);
		}
	}

}
 