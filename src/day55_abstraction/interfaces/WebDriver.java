package day55_abstraction.interfaces;

public interface WebDriver {
    public abstract void get(String url);
    public abstract void findElement(String locator);
    void quit();
    String getTitle();
}
