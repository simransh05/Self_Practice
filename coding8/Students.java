package coding8;

public class Students {
	private String name = "Kaju";
	private int age = 17;
	
	
	public Students(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void setAge(int age) { // self handle
		try {
		if(age<0) { 
			throw new Exception("Age can not be negative");
		}
		this.age=age;
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("this is a final block");
		}
	}
//	public void setAge(int age) throws Exception { //JVM will handle 
//		if(age<0) { 
//			throw new Exception("Age can not be negative");
//		}
//		this.age=age;
//	}
	public int getAge() {
		return age;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
}
