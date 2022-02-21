package Exception_Handling_Assignment;

public class Demo1 {

	public static void main(String[] args) {
		int a=10;
		try {
			for(int i=3;i>=0;i--) {
			
				System.out.println(a/i);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
	}

}
