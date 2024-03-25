package SEM_3_LABFILE.UNIT_3.Que9_JointBankingAccount;

class JointAccount
{
	long balance;
	public JointAccount(long b)
	{
		balance = b;
	}
	public long getBalance()
	{
		return balance;
	}
	public synchronized void withdraw(String user, long amount)
	{
		if(balance<amount)
		{
			System.out.println("Sorry Insufficient Funds!!");
			return;
		}
		System.out.println (user + " trying to withdraw " + amount);
		balance -= amount;
		System.out.println(user + " withdrawl of " + amount + "is succesfull \nAvailable balance after withdrawl: " + balance);
	}
}
class AccountHolders extends Thread
{
	JointAccount ja;
	String name;
	long amount;
	public AccountHolders(JointAccount j, String name, long a)
	{
		ja =j;
		this.name = name;
		amount = a;
	}
	public void run()
	{
		ja.withdraw(name, amount);
	}

}
class JointAccountSyncTest
{
	public static void main(String[] args) throws Exception
	{
		JointAccount j = new JointAccount(5000);
		System.out.println("Initial Balance:" + j.getBalance());
		AccountHolders a1 = new AccountHolders(j, "User1", 4000);
		AccountHolders a2 = new AccountHolders(j, "User2", 3000);
		a1.start();
		a2.start();
		a1.join();
		a2.join();
		System.out.println("Final Balance:" + j.getBalance());
	}
}

