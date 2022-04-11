package project_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class edgeTest {

    public static void main(String[] args) {

       String baseUrl = "http://the-internet.herokuapp.com/login";
       System.setProperty("webdriver.edge.driver","driver/msedgedriver.exe");
       WebDriver driver = new EdgeDriver();

       driver.get(baseUrl);
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        System.out.println("PAGE TITLE : "+ driver.getTitle());
        System.out.println("CURRENT URL : "+driver.getCurrentUrl());
        System.out.println("PAGE SOURCE : "+ driver.getPageSource());

        WebElement email = driver.findElement(By.id("username"));
        email.sendKeys("tomsmith");

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("SuperSecretPassword!");

        //driver.close();

    }
}
