
import java.util.Scanner;
class middle 
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		for(int i=1;i<=10;i++)
		{
			for(int j=1;j<=10;j++)
			{
				if(i>=2&&j>=1)
				{
					continue;
				}	
				System.out.println(i+" "+j);
			}
		
		}
	}
}

