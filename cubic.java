/*Bhavya kella 
 Programming Fundamentals
Exercise 1
Summer*/
import java.util.*;

public class cubic

{
	
	public static void main(String[] args)

	{
		int n;

		System.out.println("Enter The Integer:");
		
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();

		System.out.println(cube(n));
		
		sc.close();

	}

	public static int cube(int n)

	{

		int c = 0;

		for (int i = 0; i < n; i++)

		{

			for (int j = 0; j < n; j++)

			{

				for (int k = 0; k < n; k++)

				{

					c += i * j / (k + 1);

				}

			}

		}

		return c;

	}

}
	