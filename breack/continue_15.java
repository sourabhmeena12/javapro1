import java.util.Scanner;
class middle 
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<=10;i++)
		{
			if(i==5)
			{
				continue;
			}
			System.out.println(i);
		}
		
	}
}