package PageObject;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class bagPOM {
    public bagPOM(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[@id=\"i2\"]/section/div[1]/h2/a/span")
    public WebElement chooseItem;

    @FindBy(className = "dk_toggle")
    public WebElement chooseColor;

    @FindBy(xpath = "//*[@id=\"dk_container_Size-365-928\"]")
    public WebElement chooseSize;

    @FindBy(xpath = "//*[@id=\"dk_container_Size-365-928\"]/div/ul/li[3]/a")
    public WebElement selectSize;

    @FindBy(xpath = "//div[@class='AddToBag']/a")
    public WebElement addBag;

    @FindBy(className = "Icon")
    public WebElement bagIcon;

    @FindBy(className = "view_edit_bag")
    public WebElement editBag;

    @FindBy(className = "itemName")
    public WebElement actualMessage;

    public void setChooseItem()
    {
        chooseItem.click();
    }
    public void setChooseColor()
    {
        chooseColor.click();
        chooseColor.click();
    }
    public void setChooseSize()
    {
        chooseSize.click();
        selectSize.click();
    }
    public void addBag()
    {
        addBag.click();
    }
    public void setBagIcon()
    {
        bagIcon.click();
    }
    public void setEditBag()
    {
        editBag.click();
    }
    public String validateBag()
    {
        String actualMessageText =actualMessage.getText();
        return actualMessageText;
    }
}
