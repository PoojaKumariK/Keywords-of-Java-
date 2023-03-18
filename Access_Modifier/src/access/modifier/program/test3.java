package access.modifier.program;
import access.modifier.demo.test1;

public class test3 extends test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test3 t1 = new test3();
		// t3.show(); cannot able to access this method because as it is private method we cannot override:
		//System.out.println(t3.i);  private variable

	}

}
