import java.util.Scanner;
public class RateOfInterest 
{

	public static void main(String[] args) 
	{
		String gender;
		int age;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Age: ");
		age=sc.nextInt();
		System.out.println("Enter Gender(male/female): ");
		gender=sc.next();
		
		if(age>=60)
		{
			if(gender=="male")
			{
				System.out.println("The rate of interest is 7%");
			}
			else
			{
				System.out.println("The rate of interest is 7.5%");
			}
		}
		else
		{
			if(gender=="male")
			{
				System.out.println("The rate of interest is 5%");
			}
			else
			{
				System.out.println("The rate of interest is 5%");
			}
		}
		sc.close();
	}

}
