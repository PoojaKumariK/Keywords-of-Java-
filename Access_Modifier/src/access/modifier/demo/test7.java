package access.modifier.demo;

//default access modifier- within class

public class test7 {
	 int i=10;
	 void show() {
		 System.out.println("hello  world");
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test7  t= new test7();
		t.show();
		System.out.println(t.i);


	}

}
