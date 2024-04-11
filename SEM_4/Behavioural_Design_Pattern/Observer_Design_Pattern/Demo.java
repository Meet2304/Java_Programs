package SEM_4.Behavioural_Design_Pattern.Observer_Design_Pattern;

public class Demo {
    public static void main(String[] args) {
        Newsletter N1 = new Newsletter("NEWSLETTER");

        Subscriber subscriber1 = new NewsLetterSubscriber("Subscriber 1");
        Subscriber subscriber2 = new NewsLetterSubscriber("Subscriber 2");

        N1.addSubscriber(subscriber1);
        N1.addSubscriber(subscriber2);

        N1.uploadNewsletter();
        N1.notifySubscriber();

        N1.removeSubscriber(subscriber1);

        N1.uploadNewsletter();
        N1.notifySubscriber();

    }
}