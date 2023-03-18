package access.modifier.demo;

public class test1 {
	private int i=10;
	private void show()
	{
		System.out.println("hello  world");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test1  t= new test1();
		t.show();
		System.out.println(t.i);
		

	}

}
