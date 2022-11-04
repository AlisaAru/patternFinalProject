package decorator;

public class Post implements AddPost{
    @Override
    public String addPost() {
        return "Making decorator.Post.\n";
    }
}
