import java.util.Scanner;
class middle 
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		for(int i=1;i<=5; i++)
		{
			for(int j=1;j<=4;j++)
			{
				for(int k=1;k<=4;k++)
				{
					System.out.println(i+" "+j+" "+k+" ");
					
					if(k>=2)
					{
						break;
					}
					if(k>=3)
					{
						break;
					}
					if(k>=4)
					{
						break;
					}
				//System.out.print("\n");
				}
			}
		
		}
	}
}
