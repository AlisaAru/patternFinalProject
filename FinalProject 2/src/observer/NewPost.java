package observer;

import java.util.ArrayList;

public class NewPost implements Subject{
    private ArrayList<Observer> observer;
    private String newPost;
    private String newStory;
    public NewPost(){
        observer=new ArrayList<Observer>();
    }
    @Override
    public void follow(Observer newObserver) {
        observer.add(newObserver);
    }

    @Override
    public void unfollow(Observer deleteObserver) {
        int ObserverIndex = observer.indexOf(deleteObserver);
        System.out.println("user " + (ObserverIndex+1)+" unfollowed");
        observer.remove(ObserverIndex);
    }

    @Override
    public void notifyObserver() {
        for(Observer observer1:observer){
            observer1.update(newPost,newStory);
        }
    }
    public void setPost(String newPost1){
        this.newPost=newPost1;
        notifyObserver();
    }
    public void setStory(String newStory1){
        this.newStory=newStory1;
        notifyObserver();
    }
}
