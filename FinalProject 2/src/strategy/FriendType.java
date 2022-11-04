package strategy;

public class FriendType {
    public static void MyFollowers(){
        FriendType addRelative= new addRelative();
        FriendType addBestFriend= new addBestFriend();
        FriendType addSchoolFriend= new addSchoolFriend();
        FriendType addColleague= new addColleague();
        System.out.println("Magzhan: "+ addBestFriend.setType());
        System.out.println("Erasyl : "+ addSchoolFriend.setType());
        System.out.println("Aigerim: "+ addColleague.setType());
        System.out.println("Ulan : "+ addRelative.setType());
        System.out.println("Erlan : "+ addSchoolFriend.setType());
    }
    public FriendTypeBehavior friendType;
    public String setType(){
        return friendType.useType();
    }
}
class addRelative extends FriendType{
    public addRelative(){
        friendType=new Relative();
    }
}
class addBestFriend extends FriendType{
    public addBestFriend(){
        friendType=new BestFriend();
    }
}
class addSchoolFriend extends FriendType{
    public addSchoolFriend(){
        friendType=new SchoolFriend();
    }
}
class addColleague extends FriendType{
    public addColleague(){
        friendType=new Colleague();
    }}
