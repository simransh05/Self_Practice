package coding14;

public class Generic_Demo {
	public static void main(String[] args) {
		String[] arr = {"kajal","priya","karan","pooja","ankit","ankita"};
		display(arr);
		Integer [] arr1 = {1,3,3,2,1,4,3};
		display(arr1);
	}
	public static<simran> void display(simran [] arr) {
		for(int i =0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}System.out.println();
	}

}
