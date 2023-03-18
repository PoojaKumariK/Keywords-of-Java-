package oops.keyword.program;

abstract class Movie
{
	String title;
	abstract void setItem();
}
class MyMovie extends Movie
{
	MyMovie(String s)
	{
		this.title=s;
	}
	 public void setItem()
		{
			System.out.println("The name of the Movie :"+title);
		}
	 
	 
}
public class ExampleProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyMovie m = new MyMovie("Harry Potter");
		m.setItem();
		
			

	}

}
