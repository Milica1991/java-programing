package day55_abstraction.interfaces;

public class FireFoxDriver implements WebDriver {
    @Override
    public void get(String url) {
        System.out.println("FirefoxDriver - navigation to " + url);
    }

    @Override
    public void findElement(String locator) {
        System.out.println("FirefoxDriver- locating element by " + locator);


    }

    @Override
    public void quit() {
        System.out.println(" Firefox" );

    }

    @Override
    public String getTitle() {
        return "wooden spoon";
    }
}
