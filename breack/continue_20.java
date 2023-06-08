import java.util.Scanner;
class middle 
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		for(int i=1;i<20; i++)
		{
			if(i==6)
			{
				continue;
			}
			System.out.print(i);
		System.out.print("\n");
		}
	}
}