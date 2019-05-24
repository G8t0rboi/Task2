import java.util.*;

public class Practice() {

	/**
	* This program lets you know if you can vote.
	*/
	public void main(String[] args)
	{
		Scanner scan = new Scanner( System.out );
		System.out.println( Enter an age to see if you can vote );
		int age = scan.nextInt();
		if( age < 18 )
		{
			System.out.println("You can vote in "  + (18 - age) + "year(s)")
		}
		else
		{
			System.out.println("You can vote!");
		}
	}
}
