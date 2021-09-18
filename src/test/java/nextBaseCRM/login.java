package nextBaseCRM;

import Utilites.WebDriverFactory;
import Utilites.WebLogin;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class login {
    WebDriver driver;

    @BeforeClass
    public void SetUpClass() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://login2.nextbasecrm.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
       // WebLogin webLogin=new WebLogin();
       WebLogin.Login(driver);

    }

  @Test
  public void Verifying() {

WebElement forgetPassword=driver.findElement(By.xpath("//a[@class='login-link-forgot-pass']"));
forgetPassword.click();
      //2. verify users can check ""Remember me on this computer"" option

//    WebElement me=driver.findElement(By.xpath("//input[@type='checkbox']"));
//     me.click();
      //3. Verify users can access to ""FORGOT YOUR PASSWORD?"" link page


  }

    @AfterClass
    public void TearDown() {
        driver.close();

    }
}
