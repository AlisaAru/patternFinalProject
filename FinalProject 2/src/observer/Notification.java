package observer;

public class Notification {
    public static void newNotification(){
        NewPost NewPost=new NewPost();
        PostObserver PostObserver1=new PostObserver(NewPost);
        PostObserver PostObserver2=new PostObserver(NewPost);
        NewPost.setPost("I added new post");
        NewPost.setStory("I added new Story");
        NewPost.unfollow(PostObserver1);
    }
}
