package PracticeCode;

class Cal
{
	int num1;
	int num2;
	int result; //instance variable
	
	public Cal(int n1,int n2)
	{
		num1 = n1;
		num2 = n2;
	}
}


public class ThisKeyword 
{

	public static void main(String[] args) 
	{
		Cal obj = new Cal(7,8); //Constructor
		System.out.println(obj.num1);
		System.out.println(obj.num2);
		
	}
}
