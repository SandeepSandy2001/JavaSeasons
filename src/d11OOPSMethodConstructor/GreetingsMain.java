package d11OOPSMethodConstructor;

public class GreetingsMain {

	public static void main(String[] args) 
	{
		
		Greetings gr = new Greetings();
		
		gr.m1();
		
		String s = gr.m2();
		System.out.println(s);
		
		gr.m3("John");
		
		String var = gr.m4("david");
		System.out.println(var);

	}

}