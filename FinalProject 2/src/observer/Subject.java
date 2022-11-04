package observer;

public interface Subject {
    public void follow(Observer x);
    public void unfollow(Observer x);
    public void notifyObserver();
}
