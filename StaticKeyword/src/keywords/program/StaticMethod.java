package keywords.program;

class Students
{
	int roll_no;
	String name;
	static String College="GSKSJTI";
	
	Students(int r,String s)
	{
		roll_no = r;
		name = s;
		
	}
	static void change()
	{
		College = "TNF";
	}
	void display()
	{
		System.out.println(roll_no+ " "+name+ " "+College);
	}
}


public class StaticMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students s1 = new Students(109," Pooja");
		Students s2 = new Students(100,"Kavya");
		s1.display();
		s2.display();

	}

}
