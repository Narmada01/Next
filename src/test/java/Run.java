import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".",tags="@bag",dryRun = false,
        plugin={"pretty", "html:target/test-summary-report.html"})
public class Run {

}
