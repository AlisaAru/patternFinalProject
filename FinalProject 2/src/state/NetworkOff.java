package state;

public class NetworkOff implements Activity {
    @Override
    public void relaxation() {
        System.out.println("Lost internet connection...");
    }
}
