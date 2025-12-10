package d1variables;


import java.util.Scanner;

public class Sample {
	
	public static void main(String[] args) {
		
		int x;
		
		System.out.println("enter some vlaue for x ");
		
		try (Scanner input = new Scanner(System.in)) {
			x=input.nextInt();
		}
		
		System.out.println(x);
		
	}

}
