package stepDefinition;

import FunctionLibrary.CommonFunction;
import PageObject.PageObjectModel;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.concurrent.TimeUnit;

public class nextLeggingsCollection extends CommonFunction {
    PageObjectModel pageObjectModel= new PageObjectModel(driver);

    @Given("I'm on homepage {string}")
    public void i_m_on_homepage(String url) throws Exception {
        String testURL = readProperty("siteUrl");
        driver.get(testURL);
        driver.manage().window().maximize();
    }
    @When("Click on Girls menu")
    public void click_on_girls_menu() {
        pageObjectModel.setGirlsLink();
    }
    @When("Click on All Clothing menu")
    public void click_on_all_clothing_menu() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        pageObjectModel.setAllcollection();
    }
    @When("click zero to two years collection option")
    public void click_zero_to_two_years_collection_option() throws Exception
    {
        pageObjectModel.setYearsLink();
        takeScreenShot("/collection.png");
    }
    @When("Click on Leggings")
    public void click_on_leggings() {
        pageObjectModel.setLeggingClick();

    }
    @Then("land on resultant page collection")
    public void land_on_resultant_page_collection() throws Exception{
        pageObjectModel.setLeggingsList();

    }

}
