package day55_abstraction.interfaces;

public class DriverObject {
    public static void main(String[] args) {
        //WebDriver driver = new WebDriver() //Error cannot create object of interface
        ChromeDriver driver1 = new ChromeDriver();
        FireFoxDriver driver2 = new FireFoxDriver();
        WebDriver driver3 = new ChromeDriver();

        driver1.get("https://www.google.com");
        driver1.findElement("//input[@name='q']");
        System.out.println("Title = " +driver1.getTitle());
    }

}
