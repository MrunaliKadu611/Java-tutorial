package PracticeCode;

class Calci
{
	int num1;
	int num2;
	int result; //instance variable
	public Calci()
	{
		num1 = 5;
		num2 = 5;
		System.out.println("In constructor");
	}
	public Calci(int n)
	{
		num1 = n;
		num2 = n;

	}
	public Calci(double d,int n)
	{
		num1 = (int)d;
	}
}


public class Constructor {

	public static void main(String[] args) 
	{
		Calci obj = new Calci(7.5,8); //Constructor
		System.out.println(obj.num1);
		
	}

}
