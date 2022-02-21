package Exception_Handling_Assignment;
import java.util.*;

public class Demo {

	public static void main(String[] args) {
		try {
			System.out.println(5/0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("End of Program!");

	}

}

