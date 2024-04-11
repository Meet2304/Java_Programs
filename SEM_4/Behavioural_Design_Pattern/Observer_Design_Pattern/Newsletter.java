package SEM_4.Behavioural_Design_Pattern.Observer_Design_Pattern;

import java.util.ArrayList;
import java.util.List;

public class Newsletter implements Subject {

    private List<Subscriber> subscribers = new ArrayList<>();
    private String newsletterName;

    public Newsletter(String name) {
        this.newsletterName = name;
    }

    @Override
    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscriber() {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(newsletterName);
        }
    }

    @Override
    public void uploadNewsletter() {
        System.out.println("Uploading newsletter: " + newsletterName);
    }
}
