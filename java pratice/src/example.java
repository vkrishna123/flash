 class Abs
{
	double num1;
	double num2;
	
	public Abs()
	{
		num1=4;
		num2=5;
		
		
	}
	public Abs(int a)
	{
		num1=a;
		num2=a;
		
	}
	public Abs(double a,double d)
	{
		num1=a;
		num2=d;
	}
}


public class example
{
	public static void main(String[] args)
	{
		Abs obj=new Abs(4.4d,4d);
		System.out.println(obj.num1);
		System.out.println(obj.num2);
	
	
		
	}
}