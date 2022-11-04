package state;

public class WorkInstagram {
    Activity activity;

    public void setActivity(Activity activity){
        this.activity = activity;
    }

    public void changeActivity(){
        if (activity instanceof NetworkOff){
            setActivity(new NetworkOn());
        } else if (activity instanceof NetworkOn){
            setActivity(new NetworkOff());
        }
    }
    public void relaxation(){
        activity.relaxation();
    }
}
