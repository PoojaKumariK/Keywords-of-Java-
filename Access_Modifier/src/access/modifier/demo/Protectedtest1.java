package access.modifier.demo;

//protected access modifier: within the class:

public class Protectedtest1 {
	protected int i =20;
	protected void show()
	{
		System.out.println("hello world");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Protectedtest1 p = new Protectedtest1();
		p.show();
		System.out.println(p.i);

	}

}
