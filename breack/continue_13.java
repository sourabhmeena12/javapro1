import java.util.Scanner;
class middle 
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<=15;i++)
		{
			
			if(i==10||i==12)		
			{
				
				continue;
			}
			System.out.print(i+ " ");
		}
	}
}
