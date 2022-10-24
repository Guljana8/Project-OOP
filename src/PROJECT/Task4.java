package PROJECT;
/* Provide Implementation for the diagram below.
 * Then create a test class in which you need to create Objects of ChromeDriver, FirefoxDrive and SafariDriver
 * classes and see which methods available to them.
 */
interface WebDriver {
    void open();
    void close();
    String getTitle();
}
interface TakesScreenshot {
    void getScreenshot();
}

interface RemoteWebDriver extends WebDriver, TakesScreenshot {
    void navigate();
}

class ChromeDriver implements RemoteWebDriver{
    String title = "Chrome";
    @Override
    public void open() {
        System.out.println("open the "+title);
    }
    @Override
    public void close() {
        System.out.println("close the "+title);
    }
    @Override
    public String getTitle() {
        System.out.println("get title the "+title);
        return title;
    }
    @Override
    public void getScreenshot() {
        System.out.println("get screenshot the "+title);
    }
    @Override
    public void navigate() {
        System.out.println("navigate the "+title);
    }
}

class FirefoxDrive implements RemoteWebDriver {
    String title = "Firefox";
    @Override
    public void open() {
        System.out.println("open the "+title);
    }
    @Override
    public void close() {
        System.out.println("close the "+title);
    }
    @Override
    public String getTitle() {
        System.out.println("get title the "+title);
        return title;
    }
    @Override
    public void getScreenshot() {
        System.out.println("get screenshot the "+title);
    }
    @Override
    public void navigate() {
        System.out.println("navigate the "+title);
    }
}
class SafariDriver implements RemoteWebDriver {
    String title = "Safari";
    @Override
    public void open() {
        System.out.println("open the "+title);
    }
    @Override
    public void close() {
        System.out.println("close the "+title);
    }
    @Override
    public String getTitle() {
        System.out.println("get title the "+title);
        return title;
    }
    @Override
    public void getScreenshot() {
        System.out.println("get screenshot the "+title);
    }
    @Override
    public void navigate() {
        System.out.println("navigate the "+title);
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