package varargs;

public class Exercise1 {

	public static void main( String[] args ) throws Exception {
		method1("head", 1,2,3,4);
	}


	static void method1(String name, int... nums) {
		System.out.print(name);
		for(int i:nums) {
			System.out.print(","+i);
		}
	}
}
