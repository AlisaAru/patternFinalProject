package observer;

public class PostObserver implements Observer {
    private String newPost;
    private String newStory;
    private static int observerIDTracker=0;
    private final int observerID;
    private final Subject post;
    public PostObserver(Subject post){
        this.post=post;
        this.observerID=++observerIDTracker;
        System.out.println("New Follower "+this.observerID);
        post.follow(this);
    }
    @Override
    public void update(String newPost, String newStory) {
        this.newPost=newPost;
        this.newStory=newStory;
        printThePosts();
    }
    public void printThePosts(){
        System.out.println(observerID+ "\nPosts: "+newPost+"\nStorys: "+newStory);
    }

    public Subject getPost() {
        return post;
    }
}
