import java.util.Scanner;
class Calculator
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Calculator");
		while(true)
		{
			System.out.println("Addition	:	1\nSubstraction	:	2\nMultiply	:	3\nDivision	:	4\nExit		:	5");
			System.out.print("Give an input	:	");
			int input = sc.nextInt();
			System.out.print("Enter First Number	:	");
			int F1 = sc.nextInt();
			System.out.print("Enter Second Number	:	");
			int F2 = sc.nextInt();
			switch(input)
			{
				case 1:
				{
					System.out.println("Result	:	"+(F1+F2));
					break;
				}
				
			}
			System.out.println("::::::::::::::::::::::::::::::");
			break;
			
		}
		
		
		
	}
}