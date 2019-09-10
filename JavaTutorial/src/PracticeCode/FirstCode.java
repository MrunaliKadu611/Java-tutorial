package PracticeCode;

public class FirstCode {

	public static void main(String[] args) {
		int num = 500_00000; // 4 byte -> 32 bits -> 
		num = 8;
		System.out.println(num);
		
		long l = 5l; //8 bytes
		int  i = 5; // 4 bytes -> 32 bits
		short e = 5; // 2 bytes -> 16 bits -> -32768 to 32767 
		byte w = 1; // 1 byte -> 8 bytes -> -128 to 127
		float percent1 = 5.5f; 
		double percent = 5.5;
		char c = 'A';
		c = 55; //American Standard code for information interchange
		System.out.println(c);
		
		double d1 = 5l; //implicit conversions
		int k = (int)5.6; //type casting
		
		System.out.println(d1);
	}
}
