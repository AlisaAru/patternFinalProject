package bridge;

import bridge.Page;
import bridge.Theme;

public class AboutTheme implements Page {

    private Theme theme;

    public AboutTheme(Theme theme) {
        this.theme = theme;
    }

    @Override
    public String getContent() {
        return "bridge.Theme : " + this.theme.getColor();
    }

}
