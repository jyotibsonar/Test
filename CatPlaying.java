package Technoelevate;
import java.util.Scanner;

public class CatPlaying
{ 
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		boolean summer;
		int tempreture;
		System.out.println("enter summer is true or false");
		summer=sc.nextBoolean();
		System.out.println("enter a tempreture");
		tempreture=sc.nextInt();
		System.out.println(isCatPlaying(summer,tempreture));
	}
	
	public static boolean isCatPlaying(boolean summer,int tempreture)
	{

		if(summer==false && tempreture>24 && tempreture<36)
		{
			return true;
		}
		else if(summer==true && tempreture<=45)
		{
			return true;
		}
		else
		{
			return false;
		}
		 
		
	}

}
