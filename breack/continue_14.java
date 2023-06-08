import java.util.Scanner;
class middle 
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<=4;i++)
		{
			
			for(int j=1;j<=3;j++)				
			{
				if(i==3&&j==2)
				{
					continue;
				}
				System.out.println(i+"*"+j);
			}
			//System.out.println(i+"*"+j);
		}
	}
}
