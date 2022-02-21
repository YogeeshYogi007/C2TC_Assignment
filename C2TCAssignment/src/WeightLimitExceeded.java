Package Exception_Handling_Assignment;
import java.util.*;
import java.io.*;

public class WeightLimitExceeded extends Exception{
	
	
	WeightLimitExceeded(int x){
		System.out.println(Math.abs(15-x)+"kg : ");
	}

}
class M{
	void validate (int weight) {
		if (weight>15)
			throw new WeightLimitExceeded(weight);
		else
			System.out.println("you'r ready to fly!");
	}
public static void main (String[] args) {
		M ob=new M();
		Scanner in=new Scanner(System.in);
for(int i=0;i<2;i++){
	try{
		ob.validate(in.nextInt());
		}catch(WeightLimitExceeded e){
		System.out.println(e);
		}
		}
		}
		}
	

