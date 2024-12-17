package coding14;

public interface StackI {
	// before java 8
	public void push(int item); // default if not written public /private then its public 
	public int pop();
	public int peek(); // no body only data type and argument
	public static final int x=10;
	// after java 8  default and static method can have body in interface
	static void fun1(){
		// now we can 
	}
	default void fun() {
		
	}
	// java 9
	private void fun2() {
		
	}

}
