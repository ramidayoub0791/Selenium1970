import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;

public class LaunchBrowser {
    public static void main(String[] args) throws InterruptedException {
        //where the webdriver is located
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        //create an instance of webdriver
        WebDriver driver = new ChromeDriver();
     //open the website facebook.com
        driver.get("https://www.facebook.com/");
        //print out url
        String URL=driver.getCurrentUrl();
        System.out.println(URL);
        //get the title of web page
       String title= driver.getTitle();
        System.out.println("the title of the page is : "+title);
   Thread.sleep(3000);
    driver.close();
    }
}

