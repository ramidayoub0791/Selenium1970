package class02;

import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.chrome.ChromeDriver;

public class tagName {
    public static void main(String[] args) throws InterruptedException {

//        tell your project where the webdriver is located.
//        for mac user please do not use .exe with chromedriver
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

//        create an instance of WebDriver
        WebDriver driver=new ChromeDriver();
//        maximize
        driver.manage().window().maximize();
//        goto amazon,com
        driver.get("https://www.amazon.com/");
        Thread.sleep(2000);
//        print all the links in the amazon.com
        driver.findElements(By.tagName("a"));

//        to be continued in the next classs.

    }
}
