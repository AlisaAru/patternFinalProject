package strategy;

public interface FriendTypeBehavior {
    String useType();
}
class Relative implements FriendTypeBehavior{
    @Override
    public String useType() {
        return "strategy.Relative";
    }
}
class BestFriend implements FriendTypeBehavior{
    @Override
    public String useType() {
        return "Best friend";
    }
}
class SchoolFriend implements FriendTypeBehavior{
    @Override
    public String useType() {
        return "School friend";
    }
}
class Colleague implements FriendTypeBehavior{
    @Override
    public String useType() {
        return "strategy.Colleague";
    }
}