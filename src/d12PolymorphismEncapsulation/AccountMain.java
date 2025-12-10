package d12PolymorphismEncapsulation;

public class AccountMain {

	public static void main(String[] args) 
	{
		/*Account acc = new Account();
		
		acc.setAccno(101);
		System.out.println(acc.getAccno());
	
		
		acc.setName("John");
		System.out.println(acc.getName());
		
		acc.setAmount(60000);
		System.out.println(acc.getAmount());*/
		
		//or
		
		Account acc = new Account();
		
		acc.setAccno(101);
		acc.setName("john");
		acc.setAmount(60000);
		
		System.out.println(acc.getAccno());
		System.out.println(acc.getName());
		System.out.println(acc.getAmount());
		

	}

}
