package miniproject;
import java.util.Scanner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class DriverSetup {
    public static WebDriver driver=null;
    //creating the driver
    public static WebDriver createdriver()
    {
        //ask for browser
        System.out.println("Choose the Browser:");
        System.out.println("1.Chrome");
        System.out.println("2.Firefox");
        System.out.println("Enter the choice: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        sc.close();
        //if the input parameter is 1 start chrome driver
        if(x==1)
        {
            System.setProperty("webdriver.chrome.driver",
                    "/home/ishwar/Downloads/chromedriver");
            driver = new ChromeDriver();
        }
        //if the input parameter is 2 start firefox driver
        else if(x==2)
        {
            System.setProperty("webdriver.gecko.driver",
                    "/home/ishwar/Downloads/geckodriver");
            driver = new FirefoxDriver();
        }
        driver.manage().window().maximize();
        return driver;
    }
}
