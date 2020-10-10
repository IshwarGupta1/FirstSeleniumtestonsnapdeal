package miniproject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class range {
    //setting maximum and minimum price range
    public static void setPriceRange(WebDriver driver) throws Exception {
        input in=new input();
        String b=in.ReadExcelData(1,1);
        String c=in.ReadExcelData(1,2);
        WebElement minprice = driver.findElement(By.xpath("//input[@value='208']"));
        minprice.clear();
        minprice.sendKeys(b);
        //driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        Thread.sleep(3000);
        File file1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileHandler.copy(file1,new File("//home/ishwar/IdeaProjects/miniproject2/screenshots/ss2.png"));
        WebElement maxprice = driver.findElement(By.xpath("//input[@value='8059']"));
        maxprice.clear();
        maxprice.sendKeys(c);
        //driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
        Thread.sleep(3000);
        File file2=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileHandler.copy(file2,new File("/home/ishwar/IdeaProjects/miniproject2/screenshots/ss3.png"));
        //driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
        Thread.sleep(3000);
        File file3=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileHandler.copy(file3,new File("/home/ishwar/IdeaProjects/miniproject2/screenshots/ss4.png"));
        driver.findElement(By.xpath("//div[text()[normalize-space()='GO']]")).click();
    }
}