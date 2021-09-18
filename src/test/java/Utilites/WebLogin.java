package Utilites;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebLogin {

    public static void Login(WebDriver driver) {
        WebElement userName = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        userName.sendKeys("helpdesk29@cybertekschool.com");
        WebElement Password = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        Password.sendKeys("UserUser");
        WebElement me=driver.findElement(By.xpath("//input[@type='checkbox']"));
        me.click();
        WebElement loginBtn = driver.findElement(By.xpath("//input[@class='login-btn']"));
        loginBtn.click();

    }
}
