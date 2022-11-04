package template;

public abstract class InstagramTemplate {
    public void showPage(){
        System.out.println("Notifications");
        showPageContent();
        System.out.println("Other pages");
    }

    public abstract void showPageContent();
}
