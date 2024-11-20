package coding2;

public class TimeComplexity {

	public static void main(String[] args) {
		// experimental time complexity
		long start = System.currentTimeMillis();
		for(int i=0;i<1000000;i++) {
			
		}long end = System.currentTimeMillis();
		 System.out.println(end-start);
		 // asymptotic notation 
		 for(int i=0;i<10;i++) { //O(n)
			 System.out.println(i);
		 }

	}

}
