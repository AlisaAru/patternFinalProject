package builder;

public class Settings {
    private int phoneNum;
    private boolean Notification;
    private boolean Theme;
    private boolean privateAccount;


    private Settings(SettingsBuilder builder) {
        this.phoneNum = builder.phoneNum;
        this.Notification = builder.Notification;
        this.Theme = builder.Theme;
        this.privateAccount = builder.privateAccount;

    }

    public static class SettingsBuilder {
        private int phoneNum;
        private boolean Notification;
        private boolean Theme;
        private boolean privateAccount;


        public SettingsBuilder(int phoneNum) {
            this.phoneNum = phoneNum;
        }

        public SettingsBuilder onNotification() {
            this.Notification = true;
            return this;
        }
        public SettingsBuilder onDarkTheme() {
            this.Theme = true;
            return this;
        }
        public SettingsBuilder onPrivateAccount () {
            this.privateAccount = true;
            return this;
        }


        public Settings build() {
            return new Settings(this);
        }
    }

    public int getPhoneNum() {
        return phoneNum;
    }

    public boolean isOnNotification() {
        return Notification;
    }
    public boolean isOnDarkTheme() {
        return Theme;
    }

    public boolean isPrivateAccount() {
        return privateAccount;
    }
}
