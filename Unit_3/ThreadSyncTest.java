package Unit_3;
class TicketBooking{
    int available;
    public TicketBooking(int a){
        available = a;
    }
    public int getAvailable(){
        return available;
    }
    public synchronized void bookTicket(String user, int numTickets){
        if (available < numTickets){
            System.out.println("Sorry, No more: " + numTickets + " available!!");
            return;
        }
    System.out.println(user + " trying to book " + numTickets + " tickets.");
    available -= numTickets;
    System.out.println(user + " successfully booked " + numTickets + " tickets. \nAvailable Tickets: " + available);
    }
}

class User implements Runnable{
    TicketBooking t;
    String user;
    int numTickets;
    public User(TicketBooking t1, String user, int n){
        t = t1;
        this.user = user;
        numTickets = n;
    }
    public void run(){
        t.bookTicket(user, numTickets);
    }
}

public class ThreadSyncTest{
    public static void main(String[] args) throws Exception {
        TicketBooking t = new TicketBooking(5);
        System.out.println("Initial Availability: " + t.getAvailable());
        Thread t1 = new Thread (new User(t, "User1", 4));
        Thread t2 = new Thread (new User(t, "User2", 3));
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Final Availability: " + t.getAvailable());
    }
}
