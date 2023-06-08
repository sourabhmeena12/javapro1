import java.util.Scanner;
class middle 
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		for(int i=1;i<=3;i++)
		{
			for(int j=0;j<=3;j++)
			{
				if(i==2&&j==2)
				{
					break;
				}
				System.out.println(i+" "+j);
			}
		
			
		}
	}
}
