import java.util.Scanner;
class middle 
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number :");
		int num = sc.nextInt();
		
		int fyear=num/365;
		int firstyear=num%365;
		System.out.println("number of year ="+fyear);
		
		int fmonth=num/12;
		int firstmonth=num%12;
		System.out.println("number of month ="+fmonth);
		
		int fday=num/7;
		int firstday=num%7;
		System.out.println("number of day ="+fday);
	}
	
}	

