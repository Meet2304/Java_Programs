package ENDSEM_Practice;

class JointAccount{
    long balance;
    
    public JointAccount(long b){
        this.balance = b;
    }
    public long getBalance(){
        return balance;
    }
    public synchronized void withdraw(String user, long num){
        if(balance<num){
            System.out.println("Insufficient Funds");
            return;
        }
        System.out.println(user + " wishes to withdraw " + num);
        balance -= num;
        System.out.println("Balance remaining after withdrawal: " + balance);
    }
}

class AccountHolder extends Thread{
    JointAccount JA;
    String name;
    long amount;

    public AccountHolder(JointAccount ja, String n, long a){
        this.JA = ja;
        this.amount = a;
        this.name = n;
    }
    public void run(){
        JA.withdraw(name, amount);
    }
}

public class JointBankingAccount {
    public static void main(String[] args) {
        JointAccount JA1 = new JointAccount(10000);
        System.out.println("Initial balance: " + JA1.getBalance());
        AccountHolder ah1 = new AccountHolder(JA1, "ABC", 4000);
        AccountHolder ah2 = new AccountHolder(JA1, "DEF", 6000);
        ah1.start();
        ah2.start();
        try{
            ah1.join();
            ah2.join();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
