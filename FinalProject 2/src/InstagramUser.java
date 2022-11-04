import adapter.AdapaterEditorToInstagram;
import adapter.Instagram;
import bridge.AboutTheme;

import composite.Person;
import composite.GroupChat;
import state.Activity;
import bridge.DarkTheme;
import bridge.Page;
import bridge.Theme;
import builder.Settings;
import decorator.AddPost;
import decorator.Post;
import decorator.addMore;
import mediator.ChatRoom;
import mediator.ChatRoomMediator;
import mediator.User;
import strategy.FriendType;
import observer.Notification;
import state.NetworkOff;
import state.WorkInstagram;
import template.InstagramTemplate;
import template.MainPage;
import template.RecommendationPage;


public class InstagramUser {
    public static void main(String[] args) {

        Settings burger = new Settings
                .SettingsBuilder(877777777)
                .onNotification()
                .onPrivateAccount()
                .onDarkTheme()
                .build();
        System.out.println("Setting succesfully installed!!!");
        System.out.println("\n==================================\n");


        Theme darkTheme = new DarkTheme();
        Page about = new AboutTheme(darkTheme);


        System.out.println(about.getContent());

        System.out.println("\n==================================\n");


        InstagramTemplate mainPage = new MainPage();
        InstagramTemplate recommendationPage = new RecommendationPage();


        mainPage.showPage();

        System.out.println("\n==================================\n");

        recommendationPage.showPage();

        System.out.println("\n==================================\n");


        Instagram instagram = new AdapaterEditorToInstagram();

        instagram.save();
        instagram.edit();
        instagram.delete();

        System.out.println("\n===================================\n");


        Activity activity = new NetworkOff();
        WorkInstagram workInstagram = new WorkInstagram();

        workInstagram.setActivity(activity);

        for (int i=0; i< 3; i++){
            workInstagram.relaxation();
            workInstagram.changeActivity();
        }
        System.out.println("\n===================================\n");
        AddPost addpost = new addMore(new Post());
        System.out.println(addpost.addPost());
        System.out.println("\n===================================\n");
        System.out.println("My Followers:");
        FriendType friend =new FriendType();
        friend.MyFollowers();
        System.out.println("\n===================================\n");
        Notification notification=new Notification();
        notification.newNotification();
        System.out.println("\n===================================\n");

        ChatRoomMediator mediator = new ChatRoom();

        User user1 = new User("Aruzhan", mediator);
        User user2 = new User("Amirzhan", mediator);

        user1.sendMessage("Hi! Did you make a mediator pattern?");
        user2.sendMessage("Hey! Yeah");

        System.out.println("\n===================================\n");


        Person person1 = new Person("Person1");
        Person person2 = new Person("Person2");
        Person person3 = new Person("Person3");
        Person person4 = new Person("Person4");
        Person person5 = new Person("Person5");
        Person person6 = new Person("Person6");
        GroupChat groupChat1 = new GroupChat("GroupChat1");
        GroupChat groupChat2 = new GroupChat("GroupChat2");
        GroupChat groupChat3 = new GroupChat("GroupChat3");

        groupChat1.add(person1);
        groupChat2.add(person2);
        groupChat2.add(person3);
        groupChat1.add(groupChat2);
        groupChat1.add(person4);
        groupChat3.add(person5);
        groupChat3.add(person6);
        groupChat1.add(groupChat3);


        groupChat1.display(0);


    }
}
