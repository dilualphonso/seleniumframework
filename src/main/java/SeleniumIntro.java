
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SeleniumIntro {
    public static void main(String[] args) {
        //invoking browser
        System.setProperty("WebDriver.chrome.driver","C:\\Users\\samba\\OneDrive\\Documents\\Selenium\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
     driver.get("https://rahulshettyacademy.com");
 String PageTitle = driver.getTitle();
 System.out.println(PageTitle);
    }
}
