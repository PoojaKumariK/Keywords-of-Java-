package oops.keyword.program;
class  Demo
{
	final int b =23;
	void print()
	{
		System.out.println(b);
	}
}

public class FinalVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int a =25;
		//a=34; final local variable cannot assign
		System.out.println(a);
		Demo d = new Demo();
		//d.b=22;   final instance varivable cannot assignable
		d.print();

	}

}
