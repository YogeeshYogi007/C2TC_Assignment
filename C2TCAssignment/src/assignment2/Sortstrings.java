package assignment2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Sortstrings {
	public static void main(String[] args) throws IOException {
		
		System.out.println("Enter a string value: ");
	InputStreamReader r=new InputStreamReader(System.in);    
	    BufferedReader br=new BufferedReader(r);           
	    //System.out.println("Enter your name");    
	    String s=br.readLine();    
	    //System.out.println("Welcome "+s);   
		
		//String str = s;
		char charArray[] = s.toCharArray();
		Arrays.sort(charArray);
		System.out.println(new String(charArray));

	}   
}

	