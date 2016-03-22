import java.io.*;

public class List10_2 {
	public static class Employee implements Serializable {
		private String name;
		private int age;
	}
	public static class Department implements Serializable {
		private String name;
		private Employee leader;
	}
	public static void main(String[] args) throws Exception {
		Employee tanaka = new Employee();
		tanaka.name = "“c’†ˆê˜Y";
		tanaka.age = 41;
		Department soumubu = new Department();
		soumubu.name = "‘–±•”";
		soumubu.leader = tanaka;
		FileOutputStream fos =
			new FileOutputStream("c:\\company.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(soumubu);
		oos.flush();
		oos.close();
	}
}