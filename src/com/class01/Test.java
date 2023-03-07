package com.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
    public static void main(String[] args) {
       System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        String path="https://www.google.ca/";
        driver.get(path);
  //  OR   driver.get("https://www.google.ca/");

      String URL=driver.getCurrentUrl();
      String title=driver.getTitle();

      System.out.println(driver.getCurrentUrl());
        System.out.println(path);
        System.out.println(driver.getTitle());

        if(path.equalsIgnoreCase(URL)){
            System.out.println("Match");
        }else {
            System.out.println("No Match");
        }

        if (title.equalsIgnoreCase("google")){
            System.out.println("Match");
        }else {
            System.out.println("No Match");
        }

        driver.quit();
    }
}
