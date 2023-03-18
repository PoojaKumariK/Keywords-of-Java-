package oops.keyword.program;
class Demo1
//final class Demo1
{
	int a =30;
	void print(int a) {
		System.out.println(a);
	}
}

class Demo2 extends Demo1 //final class Demo1 not allow inheritance:
{
	void print()
	{
		System.out.println("hello");
		
	}
}

public class FinalClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo2 s = new Demo2();
		s.print();
		Demo1  a= new Demo1();
		a.print(50);

	}

}
