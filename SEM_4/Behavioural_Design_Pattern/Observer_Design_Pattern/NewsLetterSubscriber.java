// NewsLetterSubscriber.java
package SEM_4.Behavioural_Design_Pattern.Observer_Design_Pattern;

public class NewsLetterSubscriber implements Subscriber {
    private String subscriberName;

    public NewsLetterSubscriber(String subscriberName) {
        this.subscriberName = subscriberName;
    }
    
    @Override
    public void update(String newsletterName) {
        System.out.println(subscriberName + " received newsletter: " + newsletterName);
    }
}

