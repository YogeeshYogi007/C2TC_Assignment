package Exception_Handling_Assignment;
import java.io.*;
public class demo6 {
	public static void findFile() throws FileNotFoundException {
		File newFile = new File("test.txt");
		FileInputStream stream = new FileInputStream(newFile);
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Print the exception");

	}

}
