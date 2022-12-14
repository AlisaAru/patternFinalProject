package mediator;

import java.util.Date;

public class ChatRoom implements ChatRoomMediator {
    @Override
    public void showMessage(User user, String msg) {
        Date date = new Date();
        String senderName = user.getName();
        System.out.println(date.toString() + ", " + senderName + ", " + msg);
    }
}
