package miniproject;
import org.openqa.selenium.WebDriver;
public class Main {
   public static WebDriver driver=null;
    public static void main(String[] args) throws Exception {
        DriverSetup ds = new DriverSetup();
        driver = ds.createdriver();//creating the driver
        opensnapdeal sd = new opensnapdeal();
        sd.openwebsite(driver);//opening the website
        search s = new search();
        s.Search(driver);//searching the item
        range Range = new range();
        Range.setPriceRange(driver);//setting the price range
        popularity popularity = new popularity();
        popularity.sortByPopularity(driver);//filtering according to the popularity
        output output=new output();
        output.display(driver);//displaying the item data
        browserclose.quit(driver);//closing the browser

    }
}


