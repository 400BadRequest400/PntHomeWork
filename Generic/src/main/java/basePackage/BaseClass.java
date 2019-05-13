package basePackage;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class BaseClass {

    public static WebDriver driver = null;

    @Parameters({"platform","url","browser"})
    @BeforeMethod
    public static WebDriver setupDriver(String platform, String url, String Browser){

        System.setProperty("webdriver.chrome.driver","../Generic/src/main/resources/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.get(url);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);

        return driver;
    }

    @AfterMethod
    public void Quit(){
        driver.quit();
    }

    public void sleep(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    //Screen Shot Method
    public static void getScreenshot(WebDriver driver) {

        // Date Format Class
        DateFormat df = new SimpleDateFormat("MM.dd.yyyy-HH:mma:ss");
        Date date = new Date();
        String name = df.format(date);
        //class variable = interface driver method parameter of file output
        File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(file,new File("src/test/resources/ScreenShot/"+name+".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        //driver.quit();
    }
}
