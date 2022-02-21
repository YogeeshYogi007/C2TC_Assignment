package Exception_Handling_Assignment;

public class Demo3 {
	static void canVote(int age) {
		if (age<18)
			System.out.println("Your are not an adult");
		else
			System.out.println("you can Vote!");
	}

	public static void main(String[] args) {
		canVote(20);
		canVote(10);
		

	}

}
/*Program 4
import java.util.*;
*/
