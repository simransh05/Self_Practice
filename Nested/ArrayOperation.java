package Nested;

public class ArrayOperation {
	public  class Statistics{
		int[] num;
		double mean() {
			double sum =0;
			for (int number :num) {
				sum+=number;
			}
			return sum/num.length;
		}
		double median() {
			return 0;
		}
		
	}

}
