package PracticeCode;


class Calc{
	int num1;
	int num2;
	int result;
	
	void perform()
	{
		result = num1 + num2;

	}
}

public class ClassesAndObjects 
{

	public static void main(String[] args) 
	{
		Calc obj = new Calc();   
		obj.num1 = 3;
		obj.num2 = 5;
		
		obj.perform();
		
		System.out.println(obj.result);

	}

}
