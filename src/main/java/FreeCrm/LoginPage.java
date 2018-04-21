package FreeCrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

   public static WebDriver driver;


    public void user_is_opens_browser() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\EclipseOxygenWorkspace\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(); //launch chrome
        driver.get("http://www.freecrm.com");
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Kishore8");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("rAchel22");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@type='submit']")).click();
    }


    public void onloginpage() throws Throwable
    {

      System.out.println("on login page");


    }


    public void LoginBtnClick() throws Throwable
    {

        System.out.println(" login Button clicked");

    }



    public void user_should_be_on_homepage() throws Throwable
    {

        System.out.println("on Home page");


    }


}
