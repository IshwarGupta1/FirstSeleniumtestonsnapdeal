package miniproject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.io.FileHandler;
import java.io.File;
import java.io.IOException;
//sorting the results by popularity
public class popularity {
    public void sortByPopularity(WebDriver driver) throws InterruptedException, IOException {
        WebElement sortDropDown = driver.findElement(By.xpath("//div[@class='sort-selected']"));
        sortDropDown.click();
        WebElement popularity = driver.findElement(By.xpath("//li[@data-sorttype='plrty']"));
        File file2=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileHandler.copy(file2,new File("//home/ishwar/IdeaProjects/miniproject2/screenshots/ss6.png"));
        popularity.click();

        Thread.sleep(2000);
        File file1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileHandler.copy(file1,new File("//home/ishwar/IdeaProjects/miniproject2/screenshots/ss7.png"));
        Thread.sleep(10000);

    }
}