package d12PolymorphismEncapsulation;

public class Account 
{
	private int accno;
	private String name;
	private double amount;
	
	
	public int getAccno() 
	{
		return accno;
	}
	
	public void setAccno(int accno) 
	{
		this.accno = accno;
	}
	
	public String getName() 
	{
		return name;
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public double getAmount() 
	{
		return amount;
	}
	
	public void setAmount(double amount) 
	{
		this.amount = amount;
	}
	
	
	          //or
	
	
	/*void setAccno(int accno)    //1st variable
	{
		this.accno=accno;
	}
	
	int getAccno() 
	{
		return(accno);
	}
	
	void setName(String name)   //2nd variable
	{
		this.name = name;
	}
	
	String getName()
	{
		return(name);
	}
	
	void setAmount(double amount)   //3rd variable
	{
		this.amount = amount;
	}
	
	double getAmount()
	{
		return(amount);
	}*/
	
	     
	
	
	
	

}
