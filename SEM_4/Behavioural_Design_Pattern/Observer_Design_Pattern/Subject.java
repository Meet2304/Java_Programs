package SEM_4.Behavioural_Design_Pattern.Observer_Design_Pattern;

public interface Subject {
    void addSubscriber(Subscriber subscriber);
    void removeSubscriber(Subscriber subscriber);
    void notifySubscriber();
    void uploadNewsletter();
}
