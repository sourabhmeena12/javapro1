import java.util.Scanner;
class middle 
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		for(int i=1;i<=8;i++)
		{
			if(i==3)
			{
				continue;
			}
			System.out.println(i++);
		}	
	}
}
