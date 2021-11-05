package PageObject;

import FunctionLibrary.CommonFunction;
import org.junit.Assert;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class PageObjectModel {
    public PageObjectModel(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }
    @FindBy(id="NI4")
    public WebElement girlsLink;

    @FindBy(xpath ="//div[@class='sidebar-links-wrap']/a[text()='All Clothing']")
    public WebElement allCollection;

    @FindBy(className ="ca-title")
    public WebElement yearsLink;

    @FindBy(xpath = "//a[text()='Leggings']")
    public WebElement leggingClick;

    @FindBy(xpath = "//a[@class='TitleText']/span")
    public List<WebElement> leggingsList;

    public void setGirlsLink()
    {
        girlsLink.click();
    }
    public void setAllcollection()
    {
        allCollection.click();
    }
    public void setYearsLink()
    {
        yearsLink.click();
    }
    public void setLeggingClick()
    {
        leggingClick.click();
    }
    public void setLeggingsList() throws Exception
    {
        for (WebElement eachItem:leggingsList)
        {
             Assert.assertTrue(eachItem.getText().contains("Leggings"));
        }
    }
}
