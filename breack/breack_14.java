import java.util.Scanner;
class middle 
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i==2&&j==2)
				{
					break;
				}
			System.out.println(i+"  "+j);
			}
			
		}
	}
}


