package uberSetup;

import basePackage.BaseClass;
import org.openqa.selenium.By;

public class UberHomePage extends BaseClass  {

    public void UberHome(){
        System.out.println(driver.getTitle());
    }

    public void uberLogin(){
        driver.findElement(By.xpath("//span[contains(text(),'Log in')]")).click();
        //getScreenshot(driver);
    }

    public void RiderSignin(){
        driver.findElement(By.xpath("//span[contains(text(),'Rider login')]")).click();
    }

    public void InputEmail(String email){
        driver.findElement(By.id("useridInput")).sendKeys(email);
        driver.findElement(By.className("push-small--right")).click();
    }

    public void Recaptcha(){
        driver.findElement(By.className("recaptcha-checkbox-checkmark")).click();
    }







}
