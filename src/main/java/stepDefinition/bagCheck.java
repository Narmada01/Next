package stepDefinition;

import FunctionLibrary.CommonFunction;
import PageObject.bagPOM;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.concurrent.TimeUnit;

public class bagCheck extends CommonFunction {

    bagPOM obj = new bagPOM(driver);

    @Given("I'm on leggings collection page")
    public void i_m_on_leggings_collection_page()throws Exception
    {
        String url= readProperty("leggingsUrl");
        driver.get(url);
        driver.manage().window().maximize();
    }
    @When("Click on a specific legging")
    public void click_on_a_specific_legging() {
        obj.setChooseItem();
    }
    @When("Choose color")
    public void choose_color() {
        obj.setChooseColor();

    }
    @When("Choose size")
    public void choose_size() {
        obj.setChooseSize();
    }
    @When("Add to bag")
    public void add_to_bag() {
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        obj.addBag();
    }
    @When("Click on Basket icon on top")
    public void click_on_basket_icon_on_top() {
        obj.setBagIcon();
    }
    @When("Click on Edit bag")
    public void click_on_view_edit_bag() {
        obj.setEditBag();
    }
    @Then("validate added items in the result page")
    public void validate_added_items_in_the_result_page() {
        String getOutput= obj.validateBag();
        String expectedMessage="Pale Pink Heart Cosy Leggings (3mths-7yrs)";
        Assert.assertTrue(getOutput.contains(expectedMessage));
    }
}
