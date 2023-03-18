package oops.keyword.program;

class shape
{
	//final void draw()
	void draw()
	{
		System.out.println("i can draw");
	}
}
class circle extends shape
{
	void draw() //final void draw() this result cannot override the method:Cannot override the final method 
	 //from shape
	{
		System.out.println("i can draw circle");
	}
}
public class FinalMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		circle c = new circle();
		c.draw();
		shape s = new shape();
		s.draw();
				

	}

}
