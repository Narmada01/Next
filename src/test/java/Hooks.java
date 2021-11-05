import FunctionLibrary.CommonFunction;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends CommonFunction {
    @Before
    public void beforeTest(){
        openBrowser();
    }
    @After
    public void afterTest(){
        closeBrowser();
    }
}
