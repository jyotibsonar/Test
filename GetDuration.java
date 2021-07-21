package Technoelevate;

public class GetDuration 
{
	public static void main(String[] args)
	{
	    System.out.println(getDurationString(145,40));	
	    System.out.println(getDurationString(190));
	}
	public static String getDurationString(int minute,int seconds)
	{
		int hour=0,min=0,sec=0;
		if(minute>=0 && seconds>=0 && seconds<=59)
		{
			hour=minute/60;
			min=minute%60;
			return hour+"h "+min+"m "+seconds+"s";
			
		}
		return "invalid value";
	}
	public static String getDurationString(int seconds)
	{
		int min=0,sec=0;
		if(seconds>=0)
		{
			min=seconds/60;
			sec=seconds%60;
			return min+"m "+sec+"s ";
		}
		return "invalid value";
	}

}
