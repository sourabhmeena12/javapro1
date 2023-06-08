import java.util.Scanner;
class middle 
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		for(int i=1;i<=10;i++)
		{
			for(int j = 10;j>=i;j--)
			{
				
				if(i>=4)
				{
					continue;
				}
				System.out.println(i+" "+j+" ");
			}
		}
	}
}
