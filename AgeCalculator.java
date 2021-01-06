import java.time.*;
import java.util.Scanner;
class AgeCalculator
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your dob [dd/mm/yyyy]: ");
		String dob=sc.nextLine();
		String arr[]=dob.split("/",3);
		int d=Integer.parseInt(arr[0]);
		int m=Integer.parseInt(arr[1]);
		int y=Integer.parseInt(arr[2]);

		var birthday = LocalDate.of(y,m,d);
		var today = LocalDate.now();
		var p = Period.between(birthday,today);
		System.out.println("Your age is: ");
		System.out.println(p.getYears()+"Years");
		System.out.println(p.getMonths()+"Month");
		System.out.println(p.getDays()+"Days");
	}
}