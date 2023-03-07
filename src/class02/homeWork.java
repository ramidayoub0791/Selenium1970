package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class homeWork {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.manage().window().maximize();
        driver.findElement(By.id("customer.firstName")).sendKeys("Rami");
        driver.findElement(By.name("customer.lastName")).sendKeys("Dayoub");
        driver.findElement(By.id("customer.address.street")).sendKeys("350 Graham");
        driver.findElement(By.name("customer.address.city")).sendKeys("Montreal");
        driver.findElement(By.id("customer.address.state")).sendKeys("Quebec");
        driver.findElement(By.name("customer.address.zipCode")).sendKeys("H3P2C8");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("5142135845");
        driver.findElement(By.name("customer.ssn")).sendKeys("123456");
        driver.findElement(By.id("customer.username")).sendKeys("ramidayoub");
        driver.findElement(By.name("customer.password")).sendKeys("Sawsan");
        driver.findElement(By.name("repeatedPassword")).sendKeys("Sawsan");
        driver.findElement(By.className("button")).click();
        Thread.sleep(3000);
        driver.close();


    }
}
