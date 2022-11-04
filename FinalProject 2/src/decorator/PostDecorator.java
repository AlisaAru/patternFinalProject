package decorator;

public abstract class PostDecorator implements AddPost {
    AddPost addpost;
    public PostDecorator(AddPost addpost){
        this.addpost=addpost;
    }

    @Override
    public String addPost(){
        return addpost.addPost();
    }
}
