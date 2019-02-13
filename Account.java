import java.util.Date;

class Account 
{
	private int id=0;
	private double balance=0;
	private static double annualInterestRate=0;
	private Date dateCreated;


	public Account ()
	{
		dateCreated=new Date();

	}
	
	public Account(int id, double balance)
	{
		this.id=id;
		this.balance=balance;
		this.dateCreated=new Date();

	}

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id=id;
	}

	public double getBalance()
	{
		return balance;
	}
	
	public void setBalance(double balance)
	{
		this.balance=balance;
	}

	public static double getAnnualInterestRate()
	{
		return annualInterestRate;
	}
	
	public static void setAnnualInterestRate(double annualInterestRate)
	{
		annualInterestRate=annualInterestRate;
	}

	public Date getDateCreated()
	{
		return this.dateCreated;
	}

	public static double getMonthlyInterestRate()
	{
		return annualInterestRate/12;
	}

	public double getMonthlyInterestAmount()
	{
		return ((this.balance*annualInterestRate)/12.0);
	}

	public void withDraw(double amount)
	{
		if (amount<this.balance)
		{
			this.balance=this.balance-amount;
		}
	}

	public double deposit (double amount)
	{
		return this.balance=this.balance-amount;
	}

}
