package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class homeWork1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        Thread.sleep(3000);
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(3000);
        driver.findElement(By.name("firstname")).sendKeys("John");
        driver.findElement(By.name("lastname")).sendKeys("smith");
        driver.findElement(By.name("reg_email__")).sendKeys("5452312365");
        driver.findElement(By.id("password_step_input")).sendKeys("ghjklfdK98");
        Thread.sleep(3000);
        driver.findElement(By.name("websubmit")).click();

        Thread.sleep(3000);
        driver.close();
    }
}
