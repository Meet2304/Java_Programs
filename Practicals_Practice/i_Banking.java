package Practicals_Practice;

class JointAccount{
    long balance;

    public JointAccount(int bal){
        this.balance = bal;
    }

    public long getBalance(){
        return balance;
    }

    public synchronized void withdraw(String user, long amount){
        if(balance<amount){
            System.out.println("Insufficient Funds!");
        }
        System.out.println(user + " trying to withdraw " + amount);
        balance -= amount;
        System.out.println("Available balance: " + balance);
    }

    public synchronized void deposit(String user, long amount){
        System.out.println(user + "trying to deposit" + amount);
        balance += amount;
        System.out.println("Available balance: " + balance);
    }
}

class AccountHolders extends Thread{
    JointAccount ja;
    String name;
    long amount;

    public AccountHolders(JointAccount j, String n, int a){
        this.ja = j;
        this.name = n;
        this.amount = a;     
    }

    public void run(){
        ja.withdraw(name, amount);
    }
}

class i_Banking {
    public static void main(String[] args) throws Exception {
        JointAccount j = new JointAccount(10000);
        System.out.println("Initial Balance: " + j.getBalance());
        AccountHolders ah1 = new AccountHolders(j, "User1", 4000);
        AccountHolders ah2 = new AccountHolders(j, "User2", 2000);
        ah1.start();
        ah2.start();
        ah1.join();
    }
}
