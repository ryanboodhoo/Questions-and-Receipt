import java.util.ArrayList;
import java.util.List;

import static java.awt.AWTEventMulticaster.remove;

public class WebsiteClass {
    private List<String> urlList;

    public WebsiteClass() {
        urlList = new ArrayList<>();
    }

    public WebsiteClass(List<String> list) {
        urlList = list;
    }

    public void printURLs() {
        urlList.add("https://pluralsight.com/search?q=java");
        urlList.add("https://medium.com/search?q=java");
        urlList.add("https://stackoverflow.com/questions/tagged/java");
        urlList.add("https://stackoverflow.com/search?q=java+list");
        urlList.add("https://reddit.com/r/java");
        urlList.add("https://reddit.com/r/javahelp");

        remove("https://medium.com/search?q=java");
    }

    private void remove(String url) {
        remove("https://medium.com/search?q=java");

    }
}
