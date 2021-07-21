package Technoelevate;

public class PrintEqual
{
	public static void main(String[] args)
	{
		printEqual(10,0,9);
	}

	public static void printEqual(int num1,int num2,int num3)
	{
		if(num1>0 && num2>0 && num3>0)
		{
			if(num1==num2&&num2==num3&&num3==num1) {
				System.out.println("All numbers are equal");
			}
			else if(num1!=num2 && num2!=num3 && num3!=num1)
			{
				System.out.println("All numbers are different");
				
			}
			else {
				System.out.println("niether all are equal or different");
			}
		}
		else {
			System.out.println("invalid numbers");
		}
		
	}
}
