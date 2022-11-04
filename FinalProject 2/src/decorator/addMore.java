package decorator;

public class addMore extends PostDecorator{
    public addMore(AddPost addpost) {
        super(addpost);
    }

    public String moreMedia(){
        return "Choosing Several Media.";
    }

    @Override
    public String addPost(){
        return super.addPost()+moreMedia();
    }
}
