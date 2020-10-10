package miniproject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
//searching for the bluetooth headphones
public class search {
    public static void Search(WebDriver driver) throws Exception{
        input in=new input();
        String a=in.ReadExcelData(1,0);
        WebElement searchBox = driver.findElement(By.xpath("/html/body/div[2]/div[4]/div[2]/div/div[2]/input"));
        searchBox.sendKeys(a);
        Thread.sleep(3000);
        File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileHandler.copy(file,new File("/home/ishwar/IdeaProjects/miniproject2/screenshots/ss1.png"));
        WebElement searchButton = driver.findElement(By.xpath("/html/body/div[2]/div[4]/div[2]/div/div[2]/button"));
        searchButton.click();

    }
}