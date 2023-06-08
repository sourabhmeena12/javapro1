import java.util.Scanner;
class middle 
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=3;j++)
			{
				if(i>2)
				{
					continue;
				}
				System.out.println(j);
				
			}
			//System.out.print(j);
		}
	}
}
