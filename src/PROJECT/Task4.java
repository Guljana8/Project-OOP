package PROJECT;
import java.sql.SQLOutput;
public class Task4 {
}
/* Provide Implementation for the diagram below.
 * Then create a test class in which you need to create Objects of ChromeDriver, FirefoxDrive and SafariDriver
 * classes and see which methods available to them.
 */
interface WebDriver {
    void open();
    void close();
    String getTitle();
}
interface TakesScheenshot {
    void getScreenshot();
}

interface RemoteWebDriver extends WebDriver, TakesScheenshot {
    void navigate();
}

class ChromeDriver implements RemoteWebDriver{
    String title = "Chrome";
    @Override
    public void open() {
        System.out.println("open the Chrome");
    }
    @Override
    public void close() {
        System.out.println("close the Chrome");
    }
    @Override
    public String getTitle() {
        System.out.println("get title the Chrome");
        return title;
    }
    @Override
    public void getScreenshot() {
        System.out.println("get screenshoot the Chrome");
    }
    @Override
    public void navigate() {
        System.out.println("navigate the Chrome");
    }
}

class FirefoxDrive implements RemoteWebDriver {
    String title = "Firefox";
    @Override
    public void open() {
        System.out.println("open the Firefox");
    }
    @Override
    public void close() {
        System.out.println("close the Firefox");
    }
    @Override
    public String getTitle() {
        System.out.println("get title the Firefox");
        return title;
    }
    @Override
    public void getScreenshot() {
        System.out.println("get screenshoot the Firefox");
    }
    @Override
    public void navigate() {
        System.out.println("navigate the Firefox");
    }
}
class SafariDriver implements RemoteWebDriver {
    String title = "Safari";
    @Override
    public void open() {
        System.out.println("open the Safari");
    }
    @Override
    public void close() {
        System.out.println("close the Safari");
    }
    @Override
    public String getTitle() {
        System.out.println("get title the Safari");
        return title;
    }
    @Override
    public void getScreenshot() {
        System.out.println("get screenshoot the Safari");
    }
    @Override
    public void navigate() {
        System.out.println("navigate the Safari");
    }
}

class Test {
    public static void main(String[] args) {
        RemoteWebDriver [] driver = {new ChromeDriver(), new FirefoxDrive(), new SafariDriver()};
        for(RemoteWebDriver web : driver) {
            web.open();
            web.close();
            web.getTitle();
            web.getScreenshot();
            web.navigate();
            System.out.println("----------------------");
        }
    }
}