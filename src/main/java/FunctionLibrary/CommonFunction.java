package FunctionLibrary;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class CommonFunction {
    public static WebDriver driver;
    public String screenshotpath=new File("src/main/resources/errShots").getAbsolutePath();
    public String propertyFilePath=new File("src/main/resources/testData/config.properties").getAbsolutePath();
    public void openBrowser()
    {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        //driver.manage().window().maximize();
    }
    public void takeScreenShot(String fileName) throws Exception
    {
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File virtualFile= screenshot.getScreenshotAs(OutputType.FILE);
        File physicalFile= new File(screenshotpath+ fileName);
        FileUtils.copyFile(virtualFile,physicalFile);
    }
    public String readProperty(String key) throws Exception
    {
        FileInputStream inputStream= new FileInputStream(propertyFilePath);
        Properties properties=new Properties();
        properties.load(inputStream);
        return properties.getProperty(key);
    }

    public void closeBrowser()
    {
        //driver.quit();
    }
}
