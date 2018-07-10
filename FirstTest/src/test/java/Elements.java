import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import javax.print.attribute.SetOfIntegerSyntax;
import java.util.concurrent.TimeUnit;

public class Elements {
    private WebDriver driver;
    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
        driver = new ChromeDriver();
        //   baseUrl = "https://www.katalon.com/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void elementsTest(){
        driver.get("https://www.google.com/");
        WebElement settings = driver.findElement(By.id("fsettl"));



        driver.navigate().refresh();
        settings.click();
    }
    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
