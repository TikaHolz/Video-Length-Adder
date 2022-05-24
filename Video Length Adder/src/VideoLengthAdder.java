import java.util.Scanner;
public class VideoLengthAdder
	{

		public static void main(String[] args)
			{
			Scanner userIntInput = new Scanner(System.in);
			System.out.println("How many hours is the first movie?");
			int hoursMovieOne = userIntInput.nextInt();
			System.out.println("How many minutes is the first movie?");
			int minutesMovieOne = userIntInput.nextInt();
			System.out.println("How many seconds is the first movie?");
			int secondsMovieOne = userIntInput.nextInt();
			System.out.println("How many hours is the second movie?");
			int hoursMovieTwo = userIntInput.nextInt();
			System.out.println("How many minutes is the second movie?");
			int minutesMovieTwo = userIntInput.nextInt();
			System.out.println("How many seconds is the second movie?");
			int secondsMovieTwo = userIntInput.nextInt();
			
		
			
			
			int totalSeconds = secondsMovieOne + secondsMovieTwo;
			int totalMinutes = minutesMovieOne + minutesMovieTwo;
			int totalHours = hoursMovieOne + hoursMovieTwo;
			
			if(totalSeconds >= 60)
				{
				totalSeconds = totalSeconds%60;
				totalMinutes ++;
				}
			if(totalMinutes >= 60)
				{
				totalMinutes = totalMinutes%60;
				totalHours ++;	
				}
			//final printing 
			System.out.println("Your movies are a total of " + totalHours + ":" + totalMinutes + ":" + totalSeconds + " ");
			
			}

	}
