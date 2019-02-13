class TestAccount
{
	public static void main(String[] args) 
	{
		Account a1,a2,a3;
		a1=new Account();
		a2=new Account(1,23.33);

		System.out.println(a2.getBalance());
		a2.setBalance(13.33);
		System.out.println(a2.getBalance());
		//System.out.println(a3);

	}
}
