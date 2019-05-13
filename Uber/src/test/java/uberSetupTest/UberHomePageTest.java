package uberSetupTest;

import org.testng.annotations.Test;
import uberSetup.UberHomePage;

public class UberHomePageTest extends UberHomePage {

    @Test    //(priority = 5)
    public void UberAppTest() throws InterruptedException {
        UberHome();
        Thread.sleep(10000);
        getScreenshot(driver);

        uberLogin();
        Thread.sleep(2000);
        getScreenshot(driver);

        RiderSignin();
        Thread.sleep(2000);
        getScreenshot(driver);

        InputEmail("djaf1981@gmail.com");
        Thread.sleep(2000);
        getScreenshot(driver);

        //Recaptcha();
        //Thread.sleep(2000);
    }


/*
    @Test(priority = 1)
    public void UberHomeTest() throws InterruptedException {
        UberHome();
        Thread.sleep(4000);
        getScreenshot(driver);
    }

    @Test(priority = 2)
    public void uberlogin() throws InterruptedException {
        UberHome();
        uberLogin();
        Thread.sleep(4000);
        getScreenshot(driver);
    }

    @Test(priority = 3)
    public void ubersignin() throws InterruptedException {
        UberHome();
        uberLogin();
        RiderSignin();
        Thread.sleep(3000);
    }

    @Test(priority = 4)
    public void inputuberemail() throws InterruptedException {
        UberHome();
        uberLogin();
        RiderSignin();
        InputEmail("djaf1981@gmail.com");
        Thread.sleep(3000);
    }

 */

}
