import java.util.Scanner;
class middle 
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int i =1;
		while(i<10)
		{
			if(i==5)
			{
				i++;
				continue;
			}
			System.out.println(i);
			i++;
		}
	}
}
